package GradedAExercises.first.PLATFORM;

import java.util.UUID;

public class ContactController {

    private final Contact contact;


    public ContactController(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public String getId(){
        return this.contact.getId();
    }


    public String getUsername() {
        return contact.getUsername();
    }

    public void setUsername(String username) {
        this.contact.setUsername(username);
    }

    public String getEmail() {
        return this.contact.getEmail();
    }

    public void setEmail(String email) {
        this.contact.setEmail(email);
    }
}
