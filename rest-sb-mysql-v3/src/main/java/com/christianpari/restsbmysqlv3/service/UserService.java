package com.christianpari.restsbmysqlv3.service;

import com.christianpari.restsbmysqlv3.models.User;
import com.christianpari.restsbmysqlv3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  UserRepository repo;

  // GET
  public List<User> getAllUsers() { return repo.findAll(); }

  public User getUserById(Long id) { return repo.findById(id).isPresent() ? repo.findById(id).get() : null; }

  public User getUserByUsername(String username) {
    return repo.findByUsername(username).isPresent() ?
      repo.findByUsername(username).get() : null;
  }

  // PUT
  public User updateUser(User newUser) {
    User user = getUserById(newUser.getId());
    user.setName(newUser.getName());
    user.setUsername(newUser.getUsername());
    user.setEmail(newUser.getEmail());
    user.setPassword(newUser.getPassword());
    return user;
  }

  // DELETE
  public String deleteUser(Long id) {
    User user = getUserById(id);
    repo.delete(user);
    return String.format("Deleted User: %s, %s", user.getId(), user.getUsername());
  }
}
