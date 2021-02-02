package com.christianpari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Directory {
  private List<Contact> directory = new ArrayList<>();

  public void addContact(Contact newContact) { directory.add(newContact); }
  public void removeContact(Contact contact) { directory.remove(contact); }
  public List<Contact> getDirectory() { return directory; }
  private int getContactID(Contact contact) { return directory.indexOf(contact); }
  public Contact getContact(Contact contact) { return directory.get(getContactID(contact)); }

  public void editContact(
    Contact contact
    , HashMap<String, String> data
  ) {
    directory.get(getContactID(contact)).editContact(data);
  }

}
