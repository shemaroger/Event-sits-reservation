
package Service.Implementation;

import Dao.SignUpDao;
import Model.SignUp;
import Service.SignUpService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class SignupServiceIMP extends UnicastRemoteObject implements SignUpService{

    public SignupServiceIMP() throws RemoteException{
    }
    SignUpDao dao = new SignUpDao();
    @Override
    public SignUp addSignUp(SignUp signup) throws RemoteException {
        return dao.recordSignUps(signup);
    }

    @Override
    public SignUp editSignUp(SignUp signup) throws RemoteException {
      return dao.updateSignUps(signup);
    }

    @Override
    public SignUp removeSignUp(SignUp signup) throws RemoteException {
        return dao.deleteSignUps(signup);
    }

    @Override
    public SignUp findSignUp(SignUp signup) throws RemoteException {
    return dao.searchSignUps(signup);
    }

    @Override
    public List<SignUp> allSignUp() throws RemoteException {
        return dao.displaySignUps();
    }

    @Override
    public SignUp login(String email, String password, String role) throws RemoteException {
      return dao.userSignUp(email, password, role);
    }
    
}
