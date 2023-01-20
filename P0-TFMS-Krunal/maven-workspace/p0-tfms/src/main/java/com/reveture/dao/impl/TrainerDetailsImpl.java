package com.reveture.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.constant.Constant;
import com.revature.dao.TrainerDetails;
import com.revature.model.Menu;
import com.revature.model.Trainer;
import com.revature.model.TrainerTrack;
import com.revature.service.impl.LoginImpl;

public class TrainerDetailsImpl extends Trainer implements TrainerDetails {

	Scanner scString = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);

	int condition, id;
	int Check = 0;
	String track;

	private static Connection connection = DatabaseConnection.getConnection();
	private static  Logger log = Logger.getLogger(Menu.class);

	@Override
	public void registerTrainer() {

		do {
			log.info(Constant.ENTER_USERNAME);
			String username = scString.nextLine();
			log.info(Constant.ENTER_PASSWORD);
			String password = scString.nextLine();
			log.info(Constant.ENTER_ID_OF_TRAINER);
			String idOfTrainer = scString.nextLine();

			String insert = Constant.REGISTER_TRAINER_QUERRY;
			PreparedStatement ps = null;
			try {
				ps = connection.prepareStatement(insert);
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, idOfTrainer);
				int n = ps.executeUpdate();
				if (n > 0) {
					log.info(Constant.DATA_INSERTED);
				} else {
					log.info(Constant.DATA_NOT_INSERTED);
				}
			} catch (Exception e) {
				log.error(e.getMessage());
			}

			log.info(Constant.CHECKCONDITIONADD);
			condition = scInt.nextInt();
		} while (condition != 0);
		System.out.println();
		log.info(Constant.CALLMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			Menu menu = new Menu();
			try {
				menu.menuList();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.THANKYOU);
			log.info(Constant.EQUALSTYLE);
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
		}

	}

	@Override
	public void addDetails() throws Exception {

		do {
			log.info(Constant.ENTERTRAINERID);
			String id = scString.nextLine();

			log.info(Constant.ENTERTRAINERNAME);
			String name = scString.nextLine();

			String java = TrainerTrack.JAVA.toString();
			String dotnet = TrainerTrack.DOTNET.toString();
			String mainframe = TrainerTrack.MAINFRAME.toString();
			String testing = TrainerTrack.TESTING.toString();
			do {
				log.info(Constant.ENTERTRAINERTRACK);
				track = scString.nextLine().toUpperCase();
				if (track.equals(java) || track.equals(dotnet) || track.equals(mainframe) || track.equals(testing)) {
					Check++;
				} else {
					log.info(Constant.VALID);
				}
			} while (Check == 0);

			log.info(Constant.ENTERTRAINERQUALIFICATION);
			String qualification = scString.nextLine();

			log.info(Constant.ENTERTRAINEREXPERIENCE);
			int experience = scInt.nextInt();

			Trainer t1 = new Trainer(id, name, track, qualification, experience);
			String insertQuery = Constant.INSERT_QUERY;
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setString(1, t1.getTrainerId());
			ps.setString(2, t1.getTrainerName());
			ps.setString(3, t1.getTrainerTrack());
			ps.setString(4, t1.getTrainerQualification());
			ps.setInt(5, t1.getTrainerExperience());

			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println();
				log.info(Constant.DATA_INSERTED);
			} else {
				log.info(Constant.DATA_NOT_INSERTED);
			}
			log.info(Constant.CHECKCONDITIONADD);
			condition = scInt.nextInt();

		} while (condition != 0);

		System.out.println();
		log.info(Constant.CALLMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			Menu menu = new Menu();
			try {
				menu.menuList();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.THANKYOU);
			log.info(Constant.EQUALSTYLE);
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
		}

	}

	@Override
	public void showTrainerDetails() {

		java.sql.Statement stm;
		try {
			stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(Constant.SELECT_FROM_TRAINER);

			System.out.println();
			while (rs.next()) {
				System.out.format("%-7s %-13s %-13s %-8s %-5s", rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5) + " Yrs");
				System.out.println();
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		System.out.println();
		log.info(Constant.CALLMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			Menu menu = new Menu();
			try {
				menu.menuList();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.THANKYOU);
			log.info(Constant.EQUALSTYLE);
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
		}
	}

	@Override
	public void deleteTrainerDetails() {

		do {
			log.info(Constant.ENTER_ID_OF_TRAINER_TO_DELETE);
			String delId = scString.nextLine();

			PreparedStatement ps1;
			try {
				ps1 = connection.prepareStatement(Constant.DELETE_FROM_TRAINER_WHERE_TRAINER_ID);
				ps1.setString(1, delId);
				int k = ps1.executeUpdate();
				if (k > 0) {
					System.out.println();
					log.info(Constant.DELETED_SUCCESSFULLY);
				} else {
					log.info(Constant.NOT_DELETED);
				}
			} catch (Exception e) {
				log.error(e.getMessage());
			}

			log.info(Constant.CHECKCONDITIONADD);
			condition = scInt.nextInt();
		} while (condition != 0);
		System.out.println();
		log.info(Constant.CALLMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			Menu menu = new Menu();
			try {
				menu.menuList();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.THANKYOU);
			log.info(Constant.EQUALSTYLE);
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
		}

	}

	@Override
	public void editTrainerDetails() {

		PreparedStatement ps2;
		do {
			log.info(Constant.ENTER_ID_OF_TRAINER_UPDATE);
			String upId = scInt.nextLine();

			log.info(Constant.CHOOSE);
			int press = scInt.nextInt();

			switch (press) {
			case 1:
				try {
					log.info(Constant.ENTER_NEW_NAME);
					String name = scString.nextLine();
					ps2 = connection.prepareStatement(Constant.UPDATE_TRAINER_NAME);
					ps2.setString(1, name);
					ps2.setString(2, upId);
					int s = ps2.executeUpdate();
					if (s > 0) {
						log.info(Constant.UPDATED);
					} else {
						log.info(Constant.NOT_UPDATED);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				try {
					log.info(Constant.ENTER_NEW_TRACK);
					String track = scString.nextLine();
					ps2 = connection.prepareStatement(Constant.UPDATE_TRAINER_TRACK);
					ps2.setString(1, track);
					ps2.setString(2, upId);
					int s = ps2.executeUpdate();
					if (s > 0) {
						log.info(Constant.UPDATED);
					} else {
						log.info(Constant.NOT_UPDATED);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					log.info(Constant.ENTER_NEW_QUALIFICATION);
					String qualification = scString.nextLine();
					ps2 = connection.prepareStatement(Constant.UPDATE_TRAINER_QUALIFICATION);
					ps2.setString(1, qualification);
					ps2.setString(2, upId);
					int s = ps2.executeUpdate();
					if (s > 0) {
						log.info(Constant.UPDATED);
					} else {
						log.info(Constant.NOT_UPDATED);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					log.info(Constant.ENTER_NEW_EXPERIENCE);
					String experience = scString.nextLine();
					ps2 = connection.prepareStatement(Constant.UPDATE_TRAINER_EXPERIENCE);
					ps2.setString(1, experience);
					ps2.setString(2, upId);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println();
						log.info(Constant.UPDATED);
					} else {
						log.info(Constant.NOT_UPDATED);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				log.info(Constant.PRESS_VALID_KEY);
			}

			log.info(Constant.CHECKCONDITIONUPDATION);
			condition = scInt.nextInt();
		} while (condition == 1);

		System.out.println();
		log.info(Constant.CALLMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			Menu menu = new Menu();
			try {
				menu.menuList();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.THANKYOU);
			log.info(Constant.EQUALSTYLE);
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
		}
		System.out.println();
	}

}
