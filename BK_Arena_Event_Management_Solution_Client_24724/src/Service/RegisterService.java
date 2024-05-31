
package Service;

import Model.Register_to_attend;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RegisterService extends Remote{
     Register_to_attend addRegister(Register_to_attend register) throws RemoteException;
    Register_to_attend editRegister(Register_to_attend register) throws RemoteException;
    Register_to_attend removeRegister(Register_to_attend register) throws RemoteException;
    Register_to_attend findRegister(Register_to_attend register) throws RemoteException;
    List<Register_to_attend> allRegister() throws RemoteException;
    
}
