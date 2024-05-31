
package Service;

import Model.SignUp;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SignUpService extends Remote{
    SignUp addSignUp(SignUp signup) throws RemoteException;
    SignUp editSignUp(SignUp signup) throws RemoteException;
    SignUp removeSignUp(SignUp signup) throws RemoteException;
    SignUp findSignUp(SignUp signup) throws RemoteException;
    SignUp login(String email , String password, String role) throws RemoteException;
    List<SignUp> allSignUp() throws RemoteException;
}
