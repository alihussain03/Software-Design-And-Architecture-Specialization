package GradedAExercises.first.PLATFORM;

import android.content.Context;

public class ContactListController {

    private final ContactList contactList;


    public ContactListController(ContactList contactList) {
        this.contactList = contactList;
    }

    public void loadContacts(Context context) {
        contactList.loadContacts(context);
    }

    public boolean addContact(Contact contact, Context context){
        AddContactCommand addContactCommand = new AddContactCommand(contactList, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand delete_item_command = new DeleteContactCommand(contactList, contact, context);
        delete_item_command.execute();
        return delete_item_command.isExecuted();
    }

    public boolean editContact(Contact contact, Contact updatedContact, Context context){
        EditContactCommand editContactCommand = new EditContactCommand(contactList, contact, updatedContact, context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }

    public void addObserver(Observer observer) {
        contactList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contactList.removeObserver(observer);
    }
}

