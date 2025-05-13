public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Uriel";
        contact1.phoneNumber = "0566167538";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Paul";
        contact2.phoneNumber = "0574808825";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Armel";
        contact3.phoneNumber = "0101632888";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Scheki";
        contact4.phoneNumber = "0717623556";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Ezechiel";
        contact5.phoneNumber = "0778281164";
        myContactsManager.addContact(contact5);

        Contact result = myContactsManager.searchContact("Paul");

        if (result != null) {
            System.out.println("Numéro de Paul : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
