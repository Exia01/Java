package com.codingdojo.zookeeper2;

public class Mammal {

	public String name = ""; // we could have an attribute for it or we can name the animal too
	public int energyLevel = 100;
	// if we set this to private it will not be visible outside of this class //
	// would need a setter and getter?

	public int displayEnergy() { // this needs to ne int not void because it returns a number.
		System.out.println("Current energy level is: " + energyLevel);
		return energyLevel; // in case we want to do something else with it.
	}

}
