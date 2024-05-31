package Service.Implementation;

import Dao.EventDao;
import Model.Event;
import Service.EventService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class EventServiceIMP extends UnicastRemoteObject implements EventService{

    public EventServiceIMP() throws RemoteException{
    }
    EventDao dao = new EventDao();
    @Override
    public Event addEvent(Event event) throws RemoteException {
    return dao.recordEvents(event);
    }

    @Override
    public Event editEvent(Event event) throws RemoteException {
    return dao.updateEvents(event);
    }

    @Override
    public Event removeEvent(Event event) throws RemoteException {
     return dao.deleteEvents(event);
    }

    @Override
    public Event findEvent(Event event) throws RemoteException {
    return dao.searchEvents(event);
            }
    @Override
    public List<Event> allEvent() throws RemoteException {
        return dao.displayEvents();
    }
    
}
