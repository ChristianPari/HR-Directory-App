package com.christianpari.repository;

import com.christianpari.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
  Contact findByName(String name);
  Contact findById(String id);
}
