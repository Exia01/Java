package com.codingcodojo.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Person1");
        Person person2 = new Person(5, "Person2");
        Person person3 = new Person(18, "Person2");
        System.out.println(Person.getNumberOfPeople());
    }
}
