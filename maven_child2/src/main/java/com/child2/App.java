package com.child2;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        // Create a sample object
        Student student = new Student("Rahul", 25);

        // Create a Gson instance
        Gson gson = new Gson();

        // Convert object to JSON
        String json = gson.toJson(student);

      System.out.println("Hello from Child 2");
        System.out.println("JSON: " + json);
    }
}

// Simple class for serialization
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
