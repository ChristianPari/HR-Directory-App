package com.christianpari;

public class Main {

  public static void main(String[] args) {
    Application app = new Application();

    app.createUser();
    User user1 = app.getUser(1);
    user1.addContact();
    System.out.println(user1.getDirectory().displayDirectory());

    app.createUser();
    User user2 = app.getUser(2);
    user2.addContact();
    System.out.println(user2.getDirectory().displayDirectory());

    System.out.println(app.displayUsers());
  }
}
