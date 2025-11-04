package com.child1;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        // Create a sample object
        Person person = new Person("Manish", 22);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Hello from Child 1");
        System.out.println("JSON: " + json);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
