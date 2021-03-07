package com.christianpari.restsbmysqlv3.service;

import com.christianpari.restsbmysqlv3.entity.Contact;
import com.christianpari.restsbmysqlv3.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
  @Autowired
  private ContactRepository repo;

//  PUT
  public Contact saveContact(Contact contact) {
    return repo.save(contact);
  }

//  GET
  public List<Contact> getContacts() {
    return repo.findAll();
  }

  public Contact getContactByID(String id) {
    return repo.findContactById(id);
  }

  public Contact getContactByName(String name) {
    return repo.findContactByName(name);
  }

//  DELETE
  public String deleteContact(String id) {
    Contact contact = getContactByID(id);
    repo.delete(contact);
    return "Contact deleted: " + contact;
  }

//  PUT
  public Contact updateContact(Contact newContact) {
    Contact contact = getContactByID(newContact.id);
    contact.name = newContact.name;
    contact.phone = newContact.phone;
    contact.fax = newContact.fax;
    contact.company = newContact.company;
    contact.address = newContact.address;
    return repo.save(contact);
  }

}