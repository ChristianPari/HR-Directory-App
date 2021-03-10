package com.christianpari.restsbmysqlv3.security.services;

import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsClass implements UserDetails {
  private static final long serialVersionUID = 1L;

  private String id;
  private String email;
  private String password;
}
