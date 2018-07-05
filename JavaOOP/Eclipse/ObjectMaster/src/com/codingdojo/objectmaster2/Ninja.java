package com.codingdojo.objectmaster2;

public class Ninja extends Human {
	public Ninja() {
		this.health = 10;
		this.intelligence = 8;
	}

	public Ninja(int wisdom) {
		this.intelligence = wisdom;
		this.health = 50;
	}

	public void steals(Human enemy) {
		enemy.health += this.stealth;
		enemy.health -= enemy.health;
		// might be this.health = this.stealth
	}

	public void runaway() {
		this.health -= 10;
	}

}
