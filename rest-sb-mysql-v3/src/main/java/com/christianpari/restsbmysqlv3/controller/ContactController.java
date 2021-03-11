package com.christianpari.restsbmysqlv3.controller;

import com.christianpari.restsbmysqlv3.entity.Contact;
import com.christianpari.restsbmysqlv3.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contacts")
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

  @GetMapping("/getContactByID")
  public Contact getContactByID(@RequestParam("id") Long id) {
    return service.getContactByID(id);
  }

  @GetMapping("/getContactByName")
  public Contact getContactByName(@RequestParam("name") String name) { return service.getContactByName(name); }

  @PutMapping("/updateContact")
  public Contact updateContact(@RequestBody Contact contact) { return service.updateContact(contact); }

  @DeleteMapping("/deleteContact")
  public String deleteContact(@RequestParam("id") Long id) { return service.deleteContact(id); }

}