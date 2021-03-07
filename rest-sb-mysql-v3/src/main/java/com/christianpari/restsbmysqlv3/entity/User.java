package com.christianpari.restsbmysqlv3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Users")
public class User {

  @Id
  public String id;

  @Column(nullable = false)
  public String name;

  @Column(nullable = false, unique = true)
  public String email;

  @Column(nullable = false, length = 64)
  public String password;

  public User() {}

  public User(
    String name
    , String email
    , String password
  ) {
    id = UUID.randomUUID().toString();
    this.name = name;
    this.email = email;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", email='" + email + '\'' +
      ", password='" + password + '\'' +
      '}';
  }
}
