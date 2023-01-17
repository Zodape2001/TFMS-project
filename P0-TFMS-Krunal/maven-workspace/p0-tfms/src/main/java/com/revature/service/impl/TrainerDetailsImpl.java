package com.revature.service.impl;

import static java.lang.System.out;

import java.util.Iterator;
import java.util.Scanner;

import com.revatur.service.TrainerDetails;
import com.revature.constant.Constant;
import com.revature.model.Menu;
import com.revature.model.Trainer;
import com.revature.model.TrainerTrack;

public class TrainerDetailsImpl implements TrainerDetails {

	Constant constant = new Constant();
	Menu menu = new Menu();

	Scanner scString = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);

	int condition, id;
	int Check = 0;
	String track;

	public void addDetails() {

		do {

		
			out.print(constant.ENTERTRAINERID);
			int id = scInt.nextInt();

			out.print(constant.ENTERTRAINERNAME);
			String name = scString.nextLine();

			String java = TrainerTrack.JAVA.toString();
			String dotnet = TrainerTrack.DOTNET.toString();
			String mainframe = TrainerTrack.MAINFRAME.toString();
			String testing = TrainerTrack.TESTING.toString();
//			int CheckTrack = 0;

			do {
				out.print(constant.ENTERTRAINERTRACK);
				track = scString.nextLine().toUpperCase();
				if (track.equals(java) || track.equals(dotnet) || track.equals(mainframe) || track.equals(testing)) {
					Check++;
				} else {
					out.print(constant.VALID);
				}
			} while (Check == 0);

			out.print(constant.ENTERTRAINERQUALIFICATION);
			String qualification = scString.nextLine();

			out.print(constant.ENTERTRAINEREXPERIENCE);
			int experience = scInt.nextInt();

			out.print(constant.ENTERTRAINERPHONUMBER);
			String phone = scString.nextLine();

			out.print(constant.ENTERTRAINEREMAIL);
			String email = scString.nextLine();

			Trainer trainerDetails = new Trainer(id, name, track, qualification, experience, phone, email);
			trainerList.add(trainerDetails);

			out.println(constant.CHECKCONDITIONADD);
			condition = scInt.nextInt();

		} while (condition == 1);
		menu.callMenu();

	}

	public void showTrainerDetails() {
		for (Trainer a : trainerList) {
			out.println(a.toString());
		}
		System.out.println();

		menu.callMenu();

	}

	public void deleteTrainerDetails() {
		out.print(constant.ENTERTRAINERID);
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
			out.print(constant.SUCCESS);
		else
			out.print(constant.VALID);
		menu.callMenu();

	}

	public void editTrainerDetails() {

		int condition;

		do {

			out.print(constant.ENTERTRAINERID);
			int upId = scInt.nextInt();

			
			out.print(constant.CHOOSE);
			int press = scInt.nextInt();

			switch (press) {
			case 1:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Name :");
						String name = scString.nextLine();
						a.setTrainerName(name);
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			case 2:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Track :");
						String track = scString.nextLine();
						a.setTrainerTrack(track);;
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			case 3:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Qualification :");
						String qualification = scString.nextLine();
						a.setTrainerQualification(qualification);
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			case 4:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Experience :");
						int experience = scInt.nextInt();
						a.setTrainerExperience(experience);
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			case 5:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Phone :");
						String phone = scString.nextLine();
						a.setTrainerPhone(phone);
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			case 6:
				for (Trainer a : trainerList) {
					if (upId == (a.getTrainerId())) {
						out.print("Enter Trainer's New Email :");
						String email = scString.nextLine();
						a.setTrainerEmail(email);
					} else {
						out.print("Wrong Associate Id provide correct Id please ...\n");
					}
				}
				break;
			}

			out.println(constant.CHECKCONDITIONUPDATION);
			condition = scInt.nextInt();
		} while (condition == 1);

		menu.callMenu();

	}

}
