package com.christianpari.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "CONTACT_TABLE")
public class Contact {

  @Id
  private UUID id;
  private String name;
  private String phone;
  private String fax;
  private String company;
  private String address;

  public Contact() {
  }

  public Contact(
    String name
    , String phone
    , String fax
    , String company
    , String address
  ) {
    id = UUID.randomUUID();
    this.name = name;
    this.phone = phone;
    this.fax = fax;
    this.company = company;
    this.address = address;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Contact {" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", phone='" + phone + '\'' +
      ", fax='" + fax + '\'' +
      ", company='" + company + '\'' +
      ", address='" + address + '\'' +
      '}';
  }
}
