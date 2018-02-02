package com.java.pointwest.beans;

public abstract class Animal {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String animalType;
	
	
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Aname) {
		this.name = Aname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int Aage) {
		this.age = Aage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public abstract String makeSound();
	
		
	
}
