package javaConstructors;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
