package com.christianpari.restsbmysqlv3.controller;

import com.christianpari.restsbmysqlv3.models.User;
import com.christianpari.restsbmysqlv3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  UserService service;

  @GetMapping("/getUserById")
  public User getUserById(@RequestParam("id") Long id) { return service.getUserById(id); }

  @GetMapping("/getAllUsers")
  public List<User> getAllUsers() { return service.getAllUsers(); }

  @GetMapping("/getUserByUsername")
  public User getUserByUsername(@RequestParam("username") String username) { return service.getUserByUsername(username); }

  @PutMapping("/updateUser")
  public User updateUser(@RequestBody User user) { return service.updateUser(user); }

  @DeleteMapping("/deleteUser")
  public String deleteUser(@RequestParam("id") Long id) { return service.deleteUser(id); }
}
