
package Dao;

import Model.SignUp;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class SignUpDao {
    public SignUp recordSignUps(SignUp SignupObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(SignupObj);
            ss.beginTransaction().commit();
            ss.close();
            return SignupObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SignUp updateSignUps(SignUp SignupObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(SignupObj);
            ss.beginTransaction().commit();
            ss.close();
            return SignupObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SignUp deleteSignUps(SignUp SignupObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(SignupObj);
            ss.beginTransaction().commit();
            ss.close();
            return SignupObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SignUp searchSignUps(SignUp SignupObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            SignUp Signups = (SignUp) ss.get(SignUp.class, SignupObj.getId());
            ss.close();
            return Signups;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<SignUp> displaySignUps(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<SignUp> theSignUps = ss.createQuery("SELECT Signup FROM SignUp Signup").list();
            ss.close();
            return theSignUps;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
      public SignUp userSignUp(String email , String password, String role){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
           String hql = "FROM SignUp WHERE email = :email  AND password = :password AND role = :role";
            Query query = ss.createQuery(hql);
            query.setParameter("email", email );
            query.setParameter("password", password);
            query.setParameter("role", role);
            SignUp user = (SignUp) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
    
}
