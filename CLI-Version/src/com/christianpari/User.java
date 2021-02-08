package com.christianpari;

import java.util.HashMap;
import java.util.List;

public class User {
  private String email,
    password,
    company,
    address;
  private Directory directory = new Directory();

  public User(
    String email
    , String password
    , String company
    , String address
  ) {
    this.email = email;
    this.password = password;
    this.company = company;
    this.address = address;
  }

  public void addContact() {
    System.out.println("Adding new contact...\n");
    String name = Console.getString("Contacts' name: ");
    String phone = Console.getPhoneNumber("Contacts' phone number: ");
    String fax = Console.getPhoneNumber("Contacts' fax number: ");
    String address = Console.getString("Contacts' address: ");
    Contact newContact = new Contact(name, phone, fax, address);
    directory.addContact(newContact);
  }

  public void removeContact() {
    System.out.println("Removing a contact...\n");
    if (directory.getDirectory().size() == 0) {
      System.out.println("No contacts in directory...");
      return;
    }
    int contactID = Console.getInt(1, directory.getDirectory().size(), "Contact ID you wish to remove: ");
    directory.removeContact(contactID);
  }

  public void editContact() {
    System.out.println("Editing a contact...\n");
    if (directory.getDirectory().size() == 0) {
      System.out.println("No contacts in directory...");
      return;
    }

    int contactID = Console.getInt(
      1,
      directory.getDirectory().size(),
      "Contact ID you wish to edit: "
    );

    Contact contact = directory.getContact(contactID);

    List<Integer> editFields = Console.getListIntegers(
      1,
      5,
      "What fields would you like to edit?\n" +
        "1) Name: " + contact.getField("name") + "\n" +
        "2) Phone: " + contact.getField("phone") + "\n" +
        "3) Fax: " + contact.getField("fax") + "\n" +
        "4) Address: " + contact.getField("address") + "\n" +
        "5) CANCEL"
    );

    HashMap<String, String> updatedData = new HashMap<>();

    for (int fieldID : editFields) {
        switch (fieldID) {
          case 1:
            String newName = Console.getString("New name: ");
            updatedData.put("name", newName);
            break;

          case 2:
            String newPhone = Console.getString("New phone: ");
            updatedData.put("phone", newPhone);
            break;

          case 3:
            String newFax = Console.getString("New fax: ");
            updatedData.put("fax", newFax);
            break;

          case 4:
            String newAddress = Console.getString("New address: ");
            updatedData.put("address", newAddress);
            break;

          default:
            System.out.println("Canceling operation...");
            return;
        }
    }

    directory.editContact(contactID, updatedData);
  }

  public Directory getDirectory() { return directory; }
}
