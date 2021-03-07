package com.christianpari.restsbmysqlv3.controller;

import com.christianpari.restsbmysqlv3.entity.User;
import com.christianpari.restsbmysqlv3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

  @Autowired
  UserService service;

  @PostMapping("addUser")
  public User addUser(@RequestBody User user) {
    user.id = UUID.randomUUID().toString();
    return service.saveUser(user);
  }

  @GetMapping("getAllUsers")
  public List<User> getAllUsers() {
    return service.getUsers();
  }

  @GetMapping("getUserById/{id}")
  public User getUserById(@PathVariable String id) {
    return service.getUserById(id);
  }

  @GetMapping("getUserByEmail/{email}")
  public User getUserByEmail(@PathVariable String email) { return service.getUserByEmail(email); }

  @PutMapping("updateUser")
  public User updateUser(@RequestBody User user) { return service.updateUser(user); }

  @DeleteMapping("deleteUser/{id}")
  public String deleteUser(@PathVariable String id) { return service.deleteUser(id); }
}
