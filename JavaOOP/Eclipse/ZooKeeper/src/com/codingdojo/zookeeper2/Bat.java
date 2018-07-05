package com.codingdojo.zookeeper2;

public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        this.energyLevel -= 50;
        System.out.println(this.name + " flew! Lost 50 energy!");
    }

    public void eatHuman() {
        this.energyLevel += 25;
        System.out.println(this.name + " ate a person! Gained 25 energy!");
    }

    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println(this.name + " attacked a town! Lost 100 energy!");
    }

}

// The zoo keeper was happy with the work you did and now wants some more help,
// they have captured a rare specimen. Its default energy is much higher than
// most mammals, its energy level is 300. It also can do a lot more than climb -
// it can fly. Moreover, this specimen doesn't eat bananas, it eats humans...
// and it doesn't throw things, but attacks towns. The zoo keeper has caught a
// giant Bat and wants your help to track its energy levels.
//
// The bat should be tested by attacking three towns, eating two humans, flying
// twice, and then displaying its energy. Use the display energy from the
// superclass!
//
// Objectives:
// ● Implement packages to namespace your project.
//
// ● Implement inheritance.
//
// Tasks:
// ● Create a Bat class that can fly(), eatHumans(), and attackTown() and has a
// default energy level of 300.
//
// ● For the fly() method, print the sound a bat taking off and decrease its e
// ergy by 50.
//
// ● For the eatHumans() method, print the so- well, never mind, just increase i
// s energy by 25.
//
// ● For the attackTown() method, print the sound of a town on fire and d
// crease its energy by 100.
//
// ● Create a BatTest class to instantiate a bat and have it attack three t
// wns, eat two humans, and fly twice.