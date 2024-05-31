
package Service.Implementation;

import Dao.RegisterDao;
import Model.Register_to_attend;
import Service.RegisterService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class RegisterServiceIMP extends UnicastRemoteObject implements RegisterService{

    public RegisterServiceIMP() throws RemoteException{
    }
RegisterDao dao = new RegisterDao();
    @Override
    public Register_to_attend addRegister(Register_to_attend register) throws RemoteException {
    return dao.recordRegister_to_attends(register);
    }

    @Override
    public Register_to_attend editRegister(Register_to_attend register) throws RemoteException {
        return dao.updateRegister_to_attends(register);
    }

    @Override
    public Register_to_attend removeRegister(Register_to_attend register) throws RemoteException {
     return dao.deleteRegister_to_attends(register);
    }

    @Override
    public Register_to_attend findRegister(Register_to_attend register) throws RemoteException {
        return dao.searchRegister_to_attends(register);
    }

    @Override
    public List<Register_to_attend> allRegister() throws RemoteException {
     return dao.displayRegister_to_attends();
    }
    
}
