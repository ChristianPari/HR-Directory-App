package com.christianpari.restsbmysqlv3.repository;

import com.christianpari.restsbmysqlv3.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
  Contact findContactByName(String name);
  Contact findContactById(String id);
}
