package com.christianpari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

  public static List<Integer> getListIntegers(
    int min,
    int max,
    String prompt
  ) {
    List<Integer> intChoices = new ArrayList<>();

    while (true) {
      sc.nextLine();
      System.out.println(prompt);
      String choices = sc.nextLine().trim();
      List<String> choicesList = Arrays.asList(choices.split("\\s+"));

      for (String choice : choicesList) {
        if (!choice.matches("[" + min + "-" + max + "]")) {
          System.out.println("Please provide a valid choice input...");
          intChoices.clear();
          break;
        }

        int numericalChoice = Integer.parseInt(choice);
        intChoices.add(numericalChoice);
      }

      if (intChoices.size() == choicesList.size()) {
        break;
      }
    }

    return intChoices;
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

  static public String getEmail(String query) {
    while (true) {
      String email = getString(query);
      Pattern pattern = Pattern.compile("^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)" +
        "+[a-zA-Z]{2,6}$");
      Matcher matcher = pattern.matcher(email);
      boolean valid = matcher.find();
      if (valid) return email;
      System.out.println("### VALID EMAIL NEEDED ###");
    }
  }

  static public String getPassword(String query) {
    while (true) {
      String password = getString(query);
      Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
      Matcher matcher = pattern.matcher(password);
      boolean valid = matcher.find();
      if (valid) return password;
      System.out.println("### ENTER A VALID PASSWORD ###");
    }
  }

  static public String getPhoneNumber(String query) {
    while (true) {
      String phoneNumber = getString(query);
      Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
      Matcher matcher = pattern.matcher(phoneNumber);
      boolean valid = matcher.find();
      if (valid) return phoneNumber;
      System.out.println("### VALID NUMBER NEEDED ###");
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
