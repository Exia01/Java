package com.codingdojo.zookeeper1;

public class Mammal {

	public String  name = ""; // we could have an attribute for it or we can name the animal too
	public int energyLevel = 100;
	 //if we set this to private it will not be visible outside of this class // would need a setter and getter?
	
	public int displayEnergy() { // this needs to ne int not void because it returns a number. 
		System.out.println("Current energy level is: " + energyLevel );
		return energyLevel; //in case we want to do something else with it. 
	}


}



// Once this is done, she has asked that you also create a separate class of gorilla, which can throw things at people but will lose energy (-5) whenever this is done. The gorilla should also be able to eatBananas and regain energy (+10). The gorilla should also be able to climb at the expense of energy (-10).

// She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times, eat bananas twice and climb once; then print the gorilla's energy level.


// ● Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()



// ● Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.