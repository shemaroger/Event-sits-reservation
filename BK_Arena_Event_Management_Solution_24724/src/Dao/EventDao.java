
package Dao;

import Model.Event;
import java.util.List;
import org.hibernate.Session;


public class EventDao {
    public Event recordEvents(Event EventObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(EventObj);
            ss.beginTransaction().commit();
            ss.close();
            return EventObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Event updateEvents(Event EventObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(EventObj);
            ss.beginTransaction().commit();
            ss.close();
            return EventObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Event deleteEvents(Event EventObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(EventObj);
            ss.beginTransaction().commit();
            ss.close();
            return EventObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Event searchEvents(Event EventObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Event theEvent = (Event) ss.get(Event.class, EventObj.getEvent_id());
            ss.close();
            return theEvent;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Event> displayEvents(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Event> theEvents = ss.createQuery("SELECT events FROM Event events").list();
            ss.close();
            return theEvents;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
     
}
