package com.christianpari.repository;

import com.christianpari.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

  Contact findByName(String name);
  Contact findById(UUID id);
}
