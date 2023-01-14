package com.revature.model;

import com.revature.constant.*;

import java.util.ArrayList;
import java.util.Scanner;

public interface TrainerDetails {

//	initialize the arraylist as a static variable within the interface, so that it retains its data across different method calls.
	static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

	public abstract void addDetails();

	public abstract void showTrainerDetails();

	public abstract void deleteTrainerDetails();

	public abstract void editTrainerDetails();

}

class ChildTrainerDetails implements TrainerDetails {

	Constant constant = new Constant();

//	Created scanner object to take only string input from user
	Scanner scString = new Scanner(System.in);

//	Created scanner object to take only int input from user
	Scanner scInt = new Scanner(System.in);

//	Initialize condition variable which is used in do-while loop
	int condition;

	Menu menu = new Menu();

	@Override
	public void addDetails() {
		do {
			
			System.out.print(constant.ENTERTRAINERID);	 
			String id = scString.nextLine();

			System.out.print(constant.ENTERTRAINERNAME);
			String name = scString.nextLine();

//			track is enum in my module so for checking condition means if user entered value is matched with enum value
//			then only application proceed further  
			String track;
			String java = TrainerTrack.JAVA.toString();
			String dotnet = TrainerTrack.DOTNET.toString();
			String mainframe = TrainerTrack.MAINFRAME.toString();
			String testing = TrainerTrack.TESTING.toString();
			System.out.print(constant.ENTERTRAINERTRACK);
			track = scString.nextLine().toUpperCase();
			if(track.equals(java) || track.equals(dotnet)|| track.equals(mainframe) || track.equals(testing)) {
				
			}
			else
			{
				System.out.println("Please check speling and enter correct details again");
				System.out.print(constant.ENTERTRAINERTRACK);
				track = scString.nextLine().toUpperCase();
			}

			System.out.print(constant.ENTERTRAINERQUALIFICATION);
			String qualification = scString.nextLine();

			System.out.print(constant.ENTERTRAINEREXPERIENCE);
			int experience = scInt.nextInt();

			System.out.print(constant.ENTERTRAINERPHONUMBER);
			String phone = scString.nextLine();

			System.out.print(constant.ENTERTRAINEREMAIL);	
			String email = scString.nextLine();

//			created object of "Trainer(Plian Old Java Object - POJO)" class and pass the argument
			Trainer trainerDetails = new Trainer(id, name, track, qualification, experience, phone, email);
			
//			Used add() method to add the object in an ArrayList which is inisialized in an interface
			trainerList.add(trainerDetails);
			
			System.out.println(constant.CHECKCONDITION);
			condition = scInt.nextInt();

		} while (condition == 1);

		menu.menuList();	
	}

	@Override
	public void showTrainerDetails() {
		
		for (Trainer a : trainerList) {
			System.out.println(a.toString());
		}
		System.out.println();
		menu.menuList();	
	}

	@Override
	public void deleteTrainerDetails() {
		System.out.println("calling deleteTrainerDetails");
	}

	@Override
	public void editTrainerDetails() {
		System.out.println("calling editTrainerDetails");
	}

}