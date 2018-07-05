
package com.codingdojo.objectmaster1;

public class Human {
    public String name = ""; // if don't set the attritube public, it will do that for us
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;

    public Human() { // this is the default
        this.stealth = 3;
        this.strength = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int stealth) { //changing the stealth attributes.
        this.stealth = stealth;
        this.strength = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int stealth, int strength) {
        this.stealth = stealth;
        this.strength = strength;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human(int stealth, int strength, int intelligence) {
        this.stealth = stealth;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = 100;
    }

    public void displayStats() {
        System.out.println("Name: " + name + " Stealth: " + this.stealth + " Strength: " + this.strength + "\n" +"Intelligence: " + this.intelligence + " Health: " + this.health + "\n");
    }

    public void attack(Human enemy) {
        enemy.health -= this.strength;

    }
}

// Object Master: Part One
// A local D&D club has asked you to help them by creating the objects they
// might use with a simple Java program to track their players. To start, they
// would like to have only Humans in this particular campaign. The humans can
// all select various classes (Wizard, Ninja, Samurai).

// They say that the humans should all have four properties: strength,
// intelligence, stealth, and health. The starting value for each of the
// properties should be 3, except for health - that should be 100. Each human
// should also have the ability to attack, where they decrease the health of
// whatever they attacked by their strength.

// They want to see if you can make a class that they could use before anything
// further, so just implement the human class.

// Objectives:
// ● Implement packages to namespace your project.

// ● Implement inheritance.

// Tasks:
// ● Create a Human class

// ● Add the strength, stealth, and intelligence attributes with a default of 3
// 

// ● Add the health attribute with a default of 100

// ● Add the attack(Human) method that reduces the health of the attacked h
// man by the strength of the current human.

// ● Test these methods work using a HumanTest class

// public class Book {
//     public int number;
//     public String title;
//     public String language;
//     public int price;

// }
// public class Book {
//     public int number;
//     public String title;
//     public String language;
//     public int price;

// }

// ...
// ArrayList<Book> myLibrary = new ArrayList<Book>();
// myLibrary.add(new Book(1, "Thinking In Java", "English", 4999));
// myLibrary.add(new Book(2, "Hacking for Fun and Profit", "English", 1099);
// etc.

// now you can use the Collections interface and do something like:

// int total = 0;
// for (Book b : myLibrary)
// {
// total += b.price;
// System.out.println(b); // Assuming a valid toString in the Book class
// }
// System.out.println("The total value of your library is " + total);