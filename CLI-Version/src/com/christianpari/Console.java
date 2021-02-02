package com.christianpari;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Console {
  static Scanner sc = new Scanner(System.in);

  static public int getInt(
    int min,
    int max,
    String query
  ) {
    while (true) {
      System.out.println(query);
      int num = sc.nextInt();
      if (num >= min && num <= max) {
        return num;
      }
    }
  }

  static public boolean getYesNo(String query) {
    while (true) {
      System.out.println(query);
      String input = sc.nextLine().substring(0).toLowerCase();
      if (input.equals("y")) {
        return true;
      }
      if (input.equals("n")) {
        return false;
      }
    }
  }

  static public String getString(String query) {
    sc = new Scanner(System.in);
    System.out.println(query);
    return sc.nextLine();
  }

  static public String getPhoneNumber(String query) {
    while (true) {
      String phoneNumber = getString(query);
      Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
      Matcher matcher = pattern.matcher(phoneNumber);
      boolean valid = matcher.find();
      if (valid) return phoneNumber;
    }
  }

  static public void clearScreen() {
    int lines = 50;
    while (lines > 0) {
      System.out.println("\n");
      lines--;
    }
    sc.nextLine();
  }
}
