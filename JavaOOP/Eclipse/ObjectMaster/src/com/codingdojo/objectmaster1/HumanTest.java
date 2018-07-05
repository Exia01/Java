package com.codingdojo.objectmaster1;

public class HumanTest {

    public static void main(String[] args) {
    Human person1 = new Human();
    Human person2 = new Human();

    person1.attack(person2);
    person1.displayStats();
    person2.displayStats();
    }
}