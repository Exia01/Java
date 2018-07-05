
package com.codingdojo.objectmaster2;
// import java.lang.Math; // not sure if we need this?

public class Wizard extends Human {

	public Wizard() {
		this.health = 50;
		this.intelligence = 8;

	}

	public Wizard(int wisdom) {
		this.intelligence = wisdom;
		this.health = 50;
	}

	public Wizard(String name) {
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
	}

	public Wizard(int health, int wisdom) {
		this.health = health;
		this.intelligence = wisdom;
	}

	public Wizard(String name, int health, int strength, int wisdom, int stealth) {
		this.health = health;
		this.strength = strength;
		this.intelligence = wisdom;
		this.stealth = stealth;
		this.name = name;
	}

	public void heals(Human ally) {
		ally.health += this.intelligence;
	}

	public void fireball(Human enemy) {
		enemy.health -= this.intelligence * 3;
	}

}
