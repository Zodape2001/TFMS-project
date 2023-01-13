package com.revature.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1: Add Trainer details");
		System.out.println("Press 2: Show Trainer details");
		System.out.println("Press 3: Delete Trainer details");
		System.out.println("Press 4: Edit Trainer details");
		System.out.println("Press 5: Sort Trainer details");
		int press = sc.nextInt();
		ChildTrainerDetails ctd = new ChildTrainerDetails();
		switch(press)
		{
			case 1:
				ctd.addDetails();
				break;
			case 2:
				ctd.showTrainerDetails();
				break;
			case 3:
				ctd.deleteTrainerDetails();
				break;
			case 4:
				ctd.editTrainerDetails();
				break;
			case 5:
				ArrayListSort();
				break;
			default:
				System.out.println("Please press valid key !");
		}

	}

	private static void ArrayListSort() {
		Trainer trainer1 = new Trainer("T001", "Prathmesh", "Java", "PHD", 10, "1234567890", "prathmesh@gmail.com");
		Trainer trainer2 = new Trainer("T002", "Aakash", "Dotnet", "B.Tech", 8, "1234567890", "Aakash@gmail.com");
		Trainer trainer3 = new Trainer("T003", "Vasvi", "Mainframe", "PHD", 8, "1234567890", "Vasvi@gmail.com");
		Trainer trainer4 = new Trainer("T004", "Nikhita", "Testing", "M.Tech", 15, "1234567890", "Nikhita@gmail.com");
		
		ArrayList<Trainer> a = new ArrayList<Trainer>();
		a.add(trainer1);
		a.add(trainer2);
		a.add(trainer3);
		a.add(trainer4);

		System.out.println("Before sorting");

		for (Trainer trainer : a) {
			System.out.println(trainer.toString());
		}
		
		System.out.println("After sorting");
		
	
		Collections.sort(a, new Comparator<Trainer>() {

			@Override
			public int compare(Trainer o1, Trainer o2) {
				return o1.getTrainerExperience()-o2.getTrainerExperience();
			}
		});
		for (Trainer train : a) {
			System.out.println(train.toString());
		}
	}

}
