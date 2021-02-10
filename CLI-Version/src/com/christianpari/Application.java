package com.christianpari;

import java.util.HashMap;

public class Application {
  private HashMap<Integer, User> users = new HashMap<>();

  public void createUser() {
    System.out.println("Creating new user...");
    String email = Console.getString("Email: ");
    String password = Console.getString("Password: ");
    String company = Console.getString("Company: ");
    String address = Console.getString("Address: ");
    User newUser = new User(email, password, company, address);
    users.put(users.size() + 1, newUser);
  }

  public void deleteUser(int userID) { users.remove(userID); }
  public User getUser(int userID) { return users.get(userID); }

  public String displayUsers() {
    String output = "All Users";
    for (var user : users.values()) {
      output += "\n" + user.displayUser();
    }
    return output;
  }
}
