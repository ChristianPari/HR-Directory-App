package com.christianpari;

import java.util.HashMap;

public class Directory {
  private HashMap<Integer, Contact> directory = new HashMap<>();

  public void addContact(Contact newContact) { directory.put(directory.size() + 1, newContact); }
  public void removeContact(int contactID) { directory.remove(contactID); }
  public Contact getContact(int contactID) { return directory.get(contactID); }
  public HashMap<Integer, Contact> getDirectory() { return directory; }

  public void editContact(
    int contactID
    , HashMap<String, String> data
  ) {
    directory.get(contactID).editContact(data);
  }

  public String displayDirectory() {
    String display = "\nDIRECTORY\n";

    if (directory.size() == 0) {
      display += "Empty...\n";
      return display;
    }

    for (int contactID : directory.keySet()) {
      display += "Contact #" + contactID + "\n" + directory.get(contactID).getInfo() + "\n";
    }

    return display;
  }
}
