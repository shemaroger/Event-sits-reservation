
package Model;

import java.io.Serializable;
import java.util.*;

public class Event implements Serializable{
    private static final long serialVersionUID = -6252951449772242135L;
   
    private String event_id;
    private String event_name;
    private String regustered_date;
    private String event_date;
    private String event_status;

    public Event() {
    }

    public Event(String event_id) {
        this.event_id = event_id;
    }

    public Event(String event_id, String event_name, String regustered_date, String event_date, String event_status) {
        this.event_id = event_id;
        this.event_name = event_name;
        this.regustered_date = regustered_date;
        this.event_date = event_date;
        this.event_status = event_status;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getRegustered_date() {
        return regustered_date;
    }

    public void setRegustered_date(String regustered_date) {
        this.regustered_date = regustered_date;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_status() {
        return event_status;
    }

    public void setEvent_status(String event_status) {
        this.event_status = event_status;
    }

    @Override
    public String toString() {
        return event_name;
    }
}
