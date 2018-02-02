package com.java.pointwest.manager;

import java.util.List;
import java.util.Scanner;

import com.java.pointwest.beans.Animal;
import com.java.pointwest.beans.Cat;
import com.java.pointwest.beans.Dog;
import com.java.pointwest.beans.Parrot;

public class AnimalPage {
		
		public static Animal addAnimal(Scanner sc, String id) {
		Animal animal = null;
		String[] animalList = {"Dog","Cat","Parrot"};
				
		System.out.println("What animal are you trying to add?");
		System.out.println("[1]" +animalList[0]);
		System.out.println("[2]" +animalList[1]);
		System.out.println("[3]" +animalList[2]);
				
		int animalChoice = sc.nextInt();
		System.out.println("Enter the following: ");
		String userInput;
		int age;
		
		if(animalChoice == 1) {
			animal = new Dog();
			System.out.println("Name : ");
			userInput = sc.next();
			animal.setName(userInput);
			System.out.println("Age : ");
			age = sc.nextInt();
			animal.setAge(age);
			System.out.println("Gender : ");
			userInput = sc.next();
			animal.setGender(userInput);
			animal.setId(id);
			animal.setAnimalType(animalList[0]);
			System.out.println("Animal is now added!");
		}
		
		if(animalChoice == 2) {
			animal = new Cat();
			System.out.println("Name : ");
			userInput = sc.next();
			animal.setName(userInput);
			System.out.println("Age : ");
			age = sc.nextInt();
			animal.setAge(age);
			System.out.println("Gender : ");
			userInput = sc.next();
			animal.setGender(userInput);
			animal.setId(id);
			animal.setAnimalType(animalList[1]);
			System.out.println("Animal is now added!");
		}
		if(animalChoice == 3) {
			animal = new Parrot();
			System.out.println("Name : ");
			userInput = sc.next();
			animal.setName(userInput);
			System.out.println("Age : ");
			age = sc.nextInt();
			animal.setAge(age);
			System.out.println("Gender : ");
			userInput = sc.next();
			animal.setGender(userInput);
			animal.setId(id);
			animal.setAnimalType(animalList[2]);
			System.out.println("Animal is now added!");
		}
		return animal;
	}
	
		
	public static List<Animal> removeAnimal(Scanner sc, List<Animal> animalList) {
		System.out.print("Please enter the reference ID of the animal to remove: ");
		String id = sc.next();
		 if (animalList.size() == 1) {
			Animal animaltmp = animalList.get(0);
			if (id.equals(animaltmp.getId())) {
				animalList.clear();
				System.out.println("Remove success!");
			}else {
				System.out.println("Animal ID not found!");
			}
		} else {
			for (Animal animalTmp : animalList) {
				if (id.equals(animalTmp.getId())) {
					animalList.remove(animalTmp);
					System.out.println("Remove success!");
				} 
			}
		} 
		return animalList;
	}
	
	public static void viewAllAnimals(Scanner sc, List<Animal> animalList) {
		if (animalList.isEmpty()) {
			System.out.println("Shelter is empty");
		} else {
		System.out.println("Meet our lovely animal friends!\n");
		for(Animal animalTmp : animalList) {
			System.out.println(animalTmp.getId() + " : " + animalTmp.makeSound() + " " + "Hi I'm " +animalTmp.getName() + " the  " +animalTmp.getAnimalType() + ", "  +animalTmp.getAge()+ " yrs old");
		}
	}
	}
	
	
}
