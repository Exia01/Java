
package com.codingdojo.objectmaster2;

public class Human { // we could also set a count variable here if we wanted to.
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

    public Human(String name) {
        this.name = name;
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

    public Human(String name, int health, int strength, int intelligence, int stealth) {
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
    }
    // setters and getters

    public int getHealth() {
        // System.out.println("Health: " + health);
        return health;
    }

    public int getStrength() {
        // System.out.println("Strength: " + strength);
        return strength;
    }

    public int getIntelligence() {
        // System.out.println("Intelligence: " + intelligence);
        return intelligence;
    }

    public int getStealth() {
        // System.out.println("Stealth: " + stealth);
        return stealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void displayStats() {
        System.out.println("Name: " + name + " Stealth: " + this.stealth + " Strength: " + this.strength + "\n"
                + "Intelligence: " + this.intelligence + " Health: " + this.health + "\n");
    }

    public void attack(Human enemy) {
        enemy.health -= this.strength;

    }
}