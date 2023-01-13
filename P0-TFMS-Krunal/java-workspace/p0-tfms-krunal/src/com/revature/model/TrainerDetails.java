package com.revature.model;

import java.util.Scanner;

public abstract class TrainerDetails {

	public abstract void addDetails();
	public abstract void showTrainerDetails();
	public abstract void deleteTrainerDetails();
	public abstract void editTrainerDetails();
	
}



class ChildTrainerDetails extends TrainerDetails
{
	Scanner sc = new Scanner(System.in);

	@Override
	public void addDetails() {
		System.out.print("Enter your Id: ");
		String id = sc.nextLine();
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Track: ");
		String track = sc.nextLine();
		System.out.print("Enter your Qualification: ");
		String qualification = sc.nextLine();
		System.out.print("Enter your Experience: ");
		String experience = sc.nextLine();
		System.out.print("Enter your Phone Number: ");
		String phone = sc.nextLine();
		System.out.print("Enter your Email: ");
		String email = sc.nextLine();
	}

	@Override
	public void showTrainerDetails() {
		System.out.println("calling showTrainerDetails");
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