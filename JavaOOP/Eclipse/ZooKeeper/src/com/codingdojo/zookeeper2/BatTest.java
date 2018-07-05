package com.codingdojo.zookeeper2;

public class BatTest {

	public static void main(String[] args) {
		Bat kaijuBat = new Bat(); //
		kaijuBat.name = "Crator";

		kaijuBat.fly();
		kaijuBat.attackTown();
		kaijuBat.eatHuman();
		kaijuBat.displayEnergy();
	}

}
