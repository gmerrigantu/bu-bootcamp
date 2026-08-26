import java.util.*; 
 
public class ContactManager { 
 
    public static void main(String[] args) { 
 
        HashMap<String, Contact> contacts = new HashMap<>(); 
 
        contacts.put("Ada Lovelace", new Contact("Ada Lovelace", "+1 617 555 0101"));
        contacts.put("Grace Hopper", new Contact("Grace Hopper", "+1 125 555 1234"));
        contacts.put("Alan Turing", new Contact("Alan Turing", "+1 234 567 4321"));
        contacts.put("Linus Torvalds", new Contact("Linus Torvalds", "+1 999 555 4444"));
        contacts.put("Margaret Hamilton", new Contact("Margaret Hamilton", "+1 111 222 3344"));
        
        Contact foundContact = contacts.get("Ada Lovelace");
        if (foundContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(foundContact.getName() + ": " + foundContact.getPhone());
        }

        Contact missingContact = contacts.get("Unknown Person");
        if (missingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(missingContact.getName() + ": " + missingContact.getPhone());
        }
 
        ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
        sorted.sort((a, b) -> a.getName().compareTo(b.getName()));

        System.out.println("=== All Contacts ===");
        for (Contact contact : sorted) {
            System.out.println(contact.getName() + ": " + contact.getPhone());
        }
    } 
}