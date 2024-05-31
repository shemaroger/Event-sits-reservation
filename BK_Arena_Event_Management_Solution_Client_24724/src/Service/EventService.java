package Service;

import Model.Event;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface EventService extends Remote{
    Event addEvent(Event event) throws RemoteException;
    Event editEvent(Event event) throws RemoteException;
    Event removeEvent(Event event) throws RemoteException;
    Event findEvent(Event event) throws RemoteException;
    List<Event> allEvent() throws RemoteException;
}
