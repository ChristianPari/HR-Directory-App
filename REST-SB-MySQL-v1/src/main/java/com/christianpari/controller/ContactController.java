package com.christianpari.controller;

import com.christianpari.entity.Contact;
import com.christianpari.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

  @Autowired
  private ContactService service;

  @PostMapping("/addContact")
  public Contact addContact(@RequestBody Contact contact) {
    return service.saveContact(contact);
  }

  @GetMapping("/getAllContacts")
  public List<Contact> getAllContacts() {
    return service.getContacts();
  }

  @GetMapping("/getContactByID/{id}")
  public Contact getContactByID(@PathVariable int id) {
    return service.getContactByID(id);
  }

  @GetMapping("/getContactByName/{name}")
  public Contact getContactByName(@PathVariable String name) { return service.getContactByName(name); }

  @PutMapping("/updateContact")
  public Contact updateContact(@RequestBody Contact contact) { return service.updateContact(contact); }

  @DeleteMapping("/deleteContact/{id}")
  public String deleteContact(@PathVariable int id) { return service.deleteContact(id); }

}











