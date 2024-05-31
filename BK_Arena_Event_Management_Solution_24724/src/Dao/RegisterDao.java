package Dao;

import Model.Register_to_attend;
import java.util.List;
import org.hibernate.*;

public class RegisterDao {
     public Register_to_attend recordRegister_to_attends(Register_to_attend registerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(registerObj);
            ss.beginTransaction().commit();
            ss.close();
            return registerObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   public Register_to_attend updateRegister_to_attends(Register_to_attend registerObj){
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();

        // Load the entity to be updated
        Register_to_attend existingObj = (Register_to_attend) ss.load(Register_to_attend.class, registerObj.getId());

        // Update the specific column
        existingObj.setStatus(registerObj.getStatus()); // Assuming you want to update the 'status' column

        ss.update(existingObj);
        ss.getTransaction().commit();
        ss.close();

        return existingObj;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

    public Register_to_attend deleteRegister_to_attends(Register_to_attend registerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(registerObj);
            ss.beginTransaction().commit();
            ss.close();
            return registerObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Register_to_attend searchRegister_to_attends(Register_to_attend registerObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Register_to_attend registers = (Register_to_attend) ss.get(Register_to_attend.class, registerObj.getId());
            ss.close();
            return registers;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   public List<Register_to_attend> displayRegister_to_attends() {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Register_to_attend> theRegister_to_attends = ss.createQuery("SELECT register FROM Register_to_attend register").list();
        ss.close();
        return theRegister_to_attends;  
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
