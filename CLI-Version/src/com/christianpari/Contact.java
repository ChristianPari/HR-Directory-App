package com.christianpari;

import java.util.HashMap;

public class Contact {
  private HashMap<String, String> fields = new HashMap<>();

  public Contact(
    String name
    , String phone
    , String fax
    , String address
  ) {
    fields.put("name", name);
    fields.put("phone", phone);
    fields.put("fax", fax);
    fields.put("address", address);
  }

  public String getInfo() {
    String info = "";
    for (String data : fields.values()) {
      info += data + "\t\t";
    }
    return info.strip();
  }

  public void editContact(HashMap<String, String> data) {
    for (String field : data.keySet()) {
      if (fields.containsKey(field)) {
        fields.replace(field, data.get(field));
      }
    }
  }
}
