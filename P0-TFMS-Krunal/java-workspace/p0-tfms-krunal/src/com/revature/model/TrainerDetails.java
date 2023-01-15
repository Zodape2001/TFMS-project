package com.revature.model;

import com.revature.constant.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public interface TrainerDetails {

	static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

	public abstract void addDetails();

	public abstract void showTrainerDetails();

	public abstract void deleteTrainerDetails();

	public abstract void editTrainerDetails();

}

class ChildTrainerDetails implements TrainerDetails {

	Constant constant = new Constant();
	Menu menu = new Menu();

	Scanner scString = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);

	int condition;
	String track;

	@Override
	public void addDetails() {
		do {

			System.out.print(constant.ENTERTRAINERID);
			int id = scInt.nextInt();

			System.out.print(constant.ENTERTRAINERNAME);
			String name = scString.nextLine();

			String java = TrainerTrack.JAVA.toString();
			String dotnet = TrainerTrack.DOTNET.toString();
			String mainframe = TrainerTrack.MAINFRAME.toString();
			String testing = TrainerTrack.TESTING.toString();
			System.out.print(constant.ENTERTRAINERTRACK);

			track = scString.nextLine().toUpperCase();
			if (track.equals(java) || track.equals(dotnet) || track.equals(mainframe) || track.equals(testing)) {

			} else {
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

			Trainer trainerDetails = new Trainer(id, name, track, qualification, experience, phone, email);
			trainerList.add(trainerDetails);

			System.out.println(constant.CHECKCONDITION);
			condition = scInt.nextInt();

		} while (condition == 1);
		menu.callMenu();
	}

	@Override
	public void showTrainerDetails() {

		for (Trainer a : trainerList) {
			System.out.println(a.toString());
		}
		System.out.println();

		menu.callMenu();
	}

	@Override
	public void deleteTrainerDetails() {
		System.out.println("Enter an Id of the trainer: ");
		int delId = scInt.nextInt();
		Iterator<Trainer> itr = trainerList.iterator();
		int index = -1;
		while (itr.hasNext()) {
			if (itr.next().getTrainerId() == delId) {
				itr.remove();
				index = 0;
			}
		}
		if (index == 0)
			System.out.println("Deleted Successfully");
		else
			System.out.println("Id does not martched");
		menu.callMenu();
	}

	@Override
	public void editTrainerDetails() {
		int condition;

		do {

			System.out.println("Enter an Id of the trainer: ");
			int upId = scInt.nextInt();

			System.out.println(
					"Which field you want to update \nPress 1:Update Name\nPress 2:Update Track\nPress 3:Update Qualification\nPress 4:Update Experience\nPress 5:Update Phone\nPress 6:Update Email");
			int press = scInt.nextInt();

			switch (press) {
				case 1:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Name :");
							String name = scString.nextLine();
							a.setTrainerName(name);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
				case 2:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Track :");
							String track = scString.nextLine();
							a.setTrainerName(track);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
				case 3:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Qualification :");
							String qualification = scString.nextLine();
							a.setTrainerName(qualification);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
				case 4:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Experience :");
							String experience = scString.nextLine();
							a.setTrainerName(experience);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
				case 5:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Phone :");
							String phone = scString.nextLine();
							a.setTrainerName(phone);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
				case 6:
					for (Trainer a : trainerList) {
						if (upId == (a.getTrainerId())) {
							System.out.println("Enter Trainer's New Email :");
							String email = scString.nextLine();
							a.setTrainerName(email);
						} 
						else {
						System.out.println("Wrong Associate Id provide correct Id please ...\n");
						}
					}
				break;
			}

			System.out.println(constant.CHECKCONDITION);
			condition = scInt.nextInt();
		} while (condition == 1);

		menu.callMenu();

	}
}