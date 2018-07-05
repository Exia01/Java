package com.codingcodojo.person;

public class Person {
    private int age;
    private String name;
    private static int numberOfPeople = 0;
    
    public Person(int ageParam, String nameParam) {
        setAge(ageParam);
        setName(nameParam);
        setNumberOfPeople(getNumberOfPeople() + 1);
    }
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNumberOfPeople() {
		return numberOfPeople;
	}
	public static void setNumberOfPeople(int numberOfPeople) {
		Person.numberOfPeople = numberOfPeople;
	}
}
