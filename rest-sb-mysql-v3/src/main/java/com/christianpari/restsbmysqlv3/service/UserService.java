//package com.christianpari.restsbmysqlv3.service;
//
//import com.christianpari.restsbmysqlv3.models.User;
//import com.christianpari.restsbmysqlv3.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//  @Autowired
//  UserRepository repo;
//
//  //  PUT
//  public User saveUser(User user) {
//    return repo.save(user);
//  }
//
//  //  GET
//  public List<User> getUsers() {
//    return repo.findAll();
//  }
//
//  public User getUserByEmail(String email) {
//    return repo.findUserByEmail(email);
//  }
//
//  public User getUserById(String id) {
//    return repo.findUserById(id);
//  }
//
//  //  DELETE
//  public String deleteUser(String id) {
//    User user = getUserById(id);
//    repo.delete(user);
//    return "Contact deleted: " + user;
//  }
//
//  //  PUT
//  public User updateUser(User newUser) {
//    User user = getUserById(newUser.id);
//    user.name = newUser.name;
//    user.email = newUser.email;
//    user.password = newUser.password;
//    return repo.save(user);
//  }
//}
