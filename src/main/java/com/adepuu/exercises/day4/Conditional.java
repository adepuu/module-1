package com.adepuu.exercises.day4;

import java.util.Scanner;

public class Conditional {
  private static enum days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }

  public static void run() {
    Scanner scanner = new Scanner(System.in);
//    int x = scanner.nextInt();
//    if (x % 2 == 0) {
//      System.out.println("x is even");
//    } else {
//      System.out.println("x is odd");
//    }
//
//    if (x > 0) {
//      System.out.println("x is positive");
//      return;
//    } else if (x < 0) {
//      System.out.println("x is negative");
//      return;
//    }
//    System.out.println("x is zero");
//
//    int numberB = 24;
//
//    if (numberB % 2 == 0) {
//      System.out.print("Even ");
//      if (numberB % 6 == 0) {
//        System.out.println("and divisible by 6");
//      } else {
//        System.out.println("and not divisible by 6");
//      }
//    } else {
//      System.out.print("Odd ");
//      if (numberB % 3 == 0) {
//        System.out.println("and divisible by 3");
//      } else {
//        System.out.println("and not divisible by 3");
//      }
//    }


//    Switch Case
//    System.out.println("Menu:");
//    System.out.println("1. Call Police");
//    System.out.println("2. Call Paramedics");
//    System.out.println("3. Call Fire Dept");
//    System.out.println("Choose one: ");
//    int menuNumber = scanner.nextInt();




//    switch (menuNumber) {
//      case 1:
//        System.out.println("Calling Police...");
//      case 2:
//        System.out.println("Calling Paramedics...");
//        System.out.println("How many people are injured?");
//        int injuredCount = scanner.nextInt();
//        if (injuredCount > 5) {
//          System.out.println("Calling Police too...");
//        }
//        break;
//      case 3:
//        System.out.println("Calling Fire Dept...");
//        break;
//      default:
//        System.out.println("Invalid menu number");
//    }

//    switch (menuNumber) {
//      case 1 -> System.out.println("Calling Police...");
//      case 2 -> callParamedics();
//      case 3 -> System.out.println("Calling Fire Dept...");
//      default -> System.out.println("Invalid menu number");
//    }

//    days today = days.valueOf(scanner.next().toUpperCase());
//    boolean isWeekday = switch (today) {
//      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
//        System.out.println("It's a weekday");
//        // the same as return, but since it's a switch, it's yield
//        // only use yield if the switch case have multiple line
//        yield true;
//      }
//      case SATURDAY, SUNDAY -> false;
//    };
//    System.out.println("Is today a weekday? " + isWeekday);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    System.out.println("Number is " + (number % 2 == 0 ? "even" : "odd"));
  }

  private static void callParamedics() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calling Paramedics...");
    System.out.println("How many people are injured?");
    int injuredCount = scanner.nextInt();
    if (injuredCount > 5) {
      System.out.println("Calling Police too...");
    }
  }
}
