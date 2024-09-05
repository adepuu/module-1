package com.adepuu.exercises.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loops {
  public static void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many times you want to print? ");
    int count = scanner.nextInt();

    for (int i = 1; i <= count; i++) {
      System.out.println(i + ". Hello World!");
    }

    int i = 1;
    while (i <= count) {
      System.out.println(i + ". Hello World!");
      i++;
    }

    List<Users> userList = new ArrayList<>();
    userList.add(new Users("John Doe", 25));
    userList.add(new Users("Jane Doe", 30));
    userList.add(new Users("Alice", 14));

    Users[] userArray = new Users[3];
    userArray[0] = new Users("John Doe", 25);
    userArray[1] = new Users("Jane Doe", 30);
    userArray[2] = new Users("Alice", 14);

    Arrays.stream(userArray).forEach(user -> System.out.println(user.toString()));
    for (Users user : userArray) {
      System.out.println(user.toString());
    }

    userList.forEach(user -> System.out.println(user.toString()));


    List<Integer> list = new ArrayList<>();

    // At least once
    do {
      System.out.print("Input a random number or X to exit: ");
      String input = scanner.next();
      if (input.equalsIgnoreCase("x")) {
        break;
      }
      int number = 0;

      try {
        number = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Invalid number: " + input);
        continue;
      }

      if (number == 4) {
        continue;
      }
      list.add(number);
    } while (list.size() < 3);

    System.out.println("Inputted " + list.size() + " random numbers");
    System.out.println("Inputted " + list.toString());
  }
}
