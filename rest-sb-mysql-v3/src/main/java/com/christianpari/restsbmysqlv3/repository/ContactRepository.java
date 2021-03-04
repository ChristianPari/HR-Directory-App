package com.christianpari.restsbmysqlv3.repository;

import com.christianpari.restsbmysqlv3.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
  Contact findByName(String name);
  Contact findById(String id);
}
