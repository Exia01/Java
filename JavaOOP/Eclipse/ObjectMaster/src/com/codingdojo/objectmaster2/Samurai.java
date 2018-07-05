package com.codingdojo.objectmaster2;

public class Samurai extends Human {
	private static int count = 0; // the static means it is tied to this particular class to keep a count on it
									// ...example would be page visits

	public Samurai() {
		this.health = 200;
		Samurai.count += 1; // this needs to be accessed in a static way
	}

	public Samurai(String name) {
		this.name = name;
		this.health = 200;
		Samurai.count += 1;
	}

	public Samurai(String name, int health, int strength, int intelligence, int stealth) {
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		Samurai.count += 1;
	}

	public void howMany() {
		System.out.println("Samurai are around ...");
		System.out.println("There are " + Samurai.count + " Samurai");
	}

	public void meditate() {
		this.health = 200;
		System.out.println("An ancient technique ... ");
	}

	public void dealthBlow(Human foe) {
		foe.health = 0;
		System.out.println("Samurai Attacks with Dealth Blow!");
		this.health -= (this.health / 2);
	}
}
