
package Model;


import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Register_to_attend implements Serializable{
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String event;
 private String full_name;
 private String gender;
 @Column(unique = true, nullable = false, length = 18)
 private String email;
 private String phone_number;
 private String date;
 private String status;


    public Register_to_attend() {
    }

    public Register_to_attend(Integer id) {
        this.id = id;
    }

    public Register_to_attend(Integer id, String event, String full_name, String gender, String email, String phone_number, String date, String status) {
        this.id = id;
        this.event = event;
        this.full_name = full_name;
        this.gender = gender;
        this.email = email;
        this.phone_number = phone_number;
        this.date = date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
