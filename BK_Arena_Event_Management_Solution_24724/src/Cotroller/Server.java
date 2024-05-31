
package Cotroller;


import Service.Implementation.EventServiceIMP;
import Service.Implementation.RegisterServiceIMP;
import Service.Implementation.SignupServiceIMP;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6003);
            theRegistry.rebind("event", new EventServiceIMP());
            theRegistry.rebind("signup", new SignupServiceIMP());
            theRegistry.rebind("register", new RegisterServiceIMP());
            System.out.println("Server is running on port 6003");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}
}