package com.christianpari.service;

import com.christianpari.entity.Contact;
import com.christianpari.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    return repo.findById(id);
  }

  public Contact getContactByName(String name) {
    return repo.findByName(name);
  }

//  DELETE
  public String deleteContact(String id) {
    Contact contact = getContactByID(id);
    repo.delete(contact);
    return "Contact deleted: " + contact;
  }

//  PUT
  public Contact updateContact(Contact newContact) {
    Contact contact = getContactByID(newContact.getId());
    contact.setName(newContact.getName());
    contact.setPhone(newContact.getPhone());
    contact.setFax(newContact.getFax());
    contact.setCompany(newContact.getCompany());
    contact.setAddress(newContact.getAddress());
    return repo.save(contact);
  }

}
























