package com.java.pointwest.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.pointwest.beans.Animal;
import com.java.pointwest.manager.AnimalPage;

public class Home {
	public static void displayHomePage(Scanner sc) {

		List<Animal> animalList = new ArrayList<Animal>();
		List<String> mainMenuOption =  new ArrayList<String>();

		do {
			System.out.println("-------------------------------");
			System.out.println("Welcome to JC's Animal Shelter!");
			System.out.println("-------------------------------");
			
			mainMenuOption.add("Add an Animal");
			mainMenuOption.add("Remove an Animal");
			mainMenuOption.add("View all Animals");
			
			System.out.println("\nPlease select an option: ");
			System.out.println("[1] Add an Animal");
			if (animalList.isEmpty()){
				System.out.println("The shelter is currently empty! Pls add animal");
				mainMenuOption.remove("Remove an Animal");
				mainMenuOption.remove("View all Animals");
				//int tmp = mainMenuOption.size() - 1;
				//System.out.println("[1] " + mainMenuOption.get(tmp));
			} else {
				System.out.println("[2] Remove an Animal");
				System.out.println("[3] View all Animals");
			}
			int menuChoice = sc.nextInt();

			if (menuChoice == 1) {
				int newId = 1001;
				if (animalList.size() > 0) {
					int id = animalList.size() - 1;
					Animal max = animalList.get(id);
					newId = Integer.parseInt(max.getId()) + 1;
				}
				animalList.add(AnimalPage.addAnimal(sc, newId + ""));

			} else if (menuChoice == 2) {
				AnimalPage.removeAnimal(sc, animalList);
				//System.out.println(animalList.size());
				//for (Animal animalTmp : animalList) {
				//	System.out.println(animalTmp.getId());
				//}
			} else if (menuChoice == 3) {
				AnimalPage.viewAllAnimals(sc, animalList);
			}
			
		} while (animalList.size() < 2);
		
		if (animalList.size() == 2) {
			System.out.println("Shelter is full. Do you want to continue? [1]Yes [2] No");
			int userInput = sc.nextInt();
			Home.displayAnimalMenu(userInput);
			
		}
	//	System.out.println("goodbye!");

			
	}
	
	public static void displayAnimalMenu(int userInput) {
		
		if (userInput == 1) {
			//mainMenuOption.remove("Add an Animal");
			System.out.println("[2] Remove an Animal");
			System.out.println("[3] View all Animals");	
			
		} else {
			System.out.println("Program ends. Goodbye!");
		}
	}

}


