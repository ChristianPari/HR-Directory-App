package com.christianpari.restsbmysqlv3.repository;

import com.christianpari.restsbmysqlv3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  User findUserByEmail(String email);
  User findUserById(String id);
  Boolean existsByEmail(String email);
}
