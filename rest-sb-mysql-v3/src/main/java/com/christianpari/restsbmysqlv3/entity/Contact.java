package com.christianpari.restsbmysqlv3.entity;


import javax.persistence.*;

@Entity
@Table(name = "CONTACT_TABLE")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String name;
  public String phone;
  public String fax;
  public String company;
  public String address;

  public Contact() {
  }

  public Contact(
    Long id
    , String name
    , String phone
    , String fax
    , String company
    , String address
  ) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.fax = fax;
    this.company = company;
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
