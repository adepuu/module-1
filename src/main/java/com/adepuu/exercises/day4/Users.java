package com.adepuu.exercises.day4;

public class Users {
  private String name;
  private int age;

  public Users(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Name: " + name + ", Age: " + age;
  }
}
