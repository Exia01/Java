package com.codingdojo.zookeeper2;

public class Gorilla extends Mammal {
	public boolean hungry = true;

	public void throwSomething(){
		energyLevel -= 5;
		if(hungry == true){
			System.out.println(name + " threw something and lost 5 energy points. oh no! Maybe he needs a banana?");
			//we can even call a method whithin that print line command
		}else{
			System.out.println(name + " threw something again and lost 5 energy points. He's gonna get hungry.");
		}
	}

	public void eatBananas(){
		hungry = false;
		energyLevel += 10;
		System.out.println(name + " likes bananas....energy points have been increased by 10.");
		System.out.println(hungry);
	}
	public void climb(){
		energyLevel -= 10;
		System.out.println(name + " is climbing, but he gets tired. Loses 10 energy");
	}

}
