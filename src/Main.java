public class Main {
    public static void main(String[] args) {
        // Création d’un objet ContactsManager pour gérer les contacts
        ContactsManager myContactsManager = new ContactsManager();

        // Création du contact Uriel
        Contact contact1 = new Contact();
        contact1.name = "Uriel";
        contact1.phoneNumber = "0566167538";
        myContactsManager.addContact(contact1);

        // Création du contact Paul
        Contact contact2 = new Contact();
        contact2.name = "Paul";
        contact2.phoneNumber = "0574808825";
        myContactsManager.addContact(contact2);

        // Création du contact Armel
        Contact contact3 = new Contact();
        contact3.name = "Armel";
        contact3.phoneNumber = "0101632888";
        myContactsManager.addContact(contact3);

        // Création du contact Scheki
        Contact contact4 = new Contact();
        contact4.name = "Scheki";
        contact4.phoneNumber = "0717623556";
        myContactsManager.addContact(contact4);

        // Création du contact Ezechiel
        Contact contact5 = new Contact();
        contact5.name = "Ezechiel";
        contact5.phoneNumber = "0778281164";
        myContactsManager.addContact(contact5);

        // Recherche du contact "Paul" dans le gestionnaire
        Contact result = myContactsManager.searchContact("Paul");

        // Affichage du numéro de Paul s’il est trouvé
        if (result != null) {
            System.out.println("Numéro de Paul : " + result.phoneNumber);
        } else {
            // Affichage du numéro de Paul s’il est trouvé
            System.out.println("Contact non trouvé.");
        }
    }
}
