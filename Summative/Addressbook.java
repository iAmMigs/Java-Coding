package Summative;

public class Addressbook {
    private AddressEntry[] entries;
    private int size;

    public Addressbook() {
        this.entries = new AddressEntry[100];
        this.size = 0;
    }
    
    public void addEntry(AddressEntry entry) {
        if (size < 100) {
            entries[size] = entry;
            size++;
            System.out.println("Entry added successfully.");
        } else {
            System.out.println("Address book is full. Cannot add more entries.");
        }
    }

    public void deleteEntry(String name) {
        int index = findEntry(name);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                entries[i] = entries[i + 1];
            }
            size--;
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Entry not found in the address book.");
        }
    }

    // View all entries in the address book
    public void viewAllEntries() {
        if (size == 0) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Address Book Entries:");
            for (int i = 0; i < size; i++) {
                System.out.println("Entry " + (i + 1) + ":");
                entries[i].displaydata();
                System.out.println();
            }
        }
    }

    public void updateEntry(String name, AddressEntry updatedEntry) {
        int index = findEntry(name);
        if (index != -1) {
            entries[index] = updatedEntry;
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("Entry not found in the address book.");
        }
    }

    private int findEntry(String name) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
            return -1; // Entry not found
    }
}
