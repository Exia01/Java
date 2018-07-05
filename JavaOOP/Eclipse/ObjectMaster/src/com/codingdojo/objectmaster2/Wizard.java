package com.codingdojo.objectmaster2;

public class Wizard extends Human {

	public Wizard() {
		this.health = 50;
		this.intelligence = 8;

	}

	public Wizard(int wisdom) {
		this.intelligence = wisdom;
		this.health = 50;
	}

	public void heals(Human ally) {
		ally.health += this.intelligence;
	}

	public void fireball(Human enemy) {
		enemy.health -= this.intelligence * 3;
	}

}
