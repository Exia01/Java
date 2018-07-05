
package com.codingdojo.objectmaster2;

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

    public Human(int stealth) { // changing the stealth attributes.
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
        System.out.println("Name: " + name + " Stealth: " + this.stealth + " Strength: " + this.strength + "\n"
                + "Intelligence: " + this.intelligence + " Health: " + this.health + "\n");
    }

    public void attack(Human enemy) {
        enemy.health -= this.strength;

    }
}

// Object Master: Part Two




// The Samurai class should have a default health of 200; a method called
// deathBlow that attacks an object and decreases its health to 0, but also
// halves the Samurai's health; a method called meditate which heals the Samurai
// back to full health; and a method called howMany that returns the current
// number of Samurai.

// Once you are done with this, they would like to see a sample test of the
// various classes interacting.

// Objectives:
// ● Implement packages to namespace your project.

// ● Implement inheritance.

// Tasks:
// ● Create Ninja, Wizard, and Samurai classes that all extend from the Human c
// 
// ass.

// ● Wizard: Set default health to 50

// ● Wizard: Set default intelligence to 8

// ● Wizard: Add a method heal(Human) that heals the other human by the w
// zard's intelligence

// ● Wizard: Add a method fireball(Human) that decreases the other human's h
// alth by the wizard's intelligence * 3

// ● Ninja: Set default stealth to 10

// ● Ninja: Add a method steal(Human) that takes the amount of stealth the n
// nja has, removes it from the other human's health, and adds it to the n
// nja's

// ● Ninja: Add a method runAway() that decreases their health by 10

// ● Samurai: Set a default health of 200

// ● Samurai: Add a method deathBlow(Human) that kills the other human, but r
// duces the Samurai's health by half

// ● Samurai: Add a method meditate() that heals the Samurai for half of their c
// 
// rrent health.

// ● Samurai: Add a method howMany() that returns the total current number of S
// 
// murai.