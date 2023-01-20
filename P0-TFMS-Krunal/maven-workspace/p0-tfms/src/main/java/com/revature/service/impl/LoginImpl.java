package com.revature.service.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revatur.service.AdminLogin;
import com.revature.config.DatabaseConnection;
import com.revature.constant.Constant;
import com.revature.model.Menu;

public class LoginImpl implements AdminLogin {

	private static Connection connection = DatabaseConnection.getConnection();
	private static  Logger log = Logger.getLogger(Menu.class);

	Scanner scInt = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	int Check;
	Menu menu = new Menu();

	@Override
	public void login() {
		log.info(Constant.EQUALSTYLE);
		log.info(Constant.LOGIN);
		log.info(Constant.EQUALSTYLE);
		System.out.println();


		do {
			log.info(Constant.ENTER_USERNAME_LOGINIMPL);
			String username = scString.nextLine();
			log.info(Constant.ENTER_PASSWORD_LOGINIMPL);
			String password = scString.nextLine();
			System.out.println();
			if (username.equals(Constant.USERNAME) && password.equals(Constant.PASSWORD)) {
				log.info(Constant.LOGIN_SUCCESSFULL);
				try {
					menu.menuList();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					PreparedStatement stmt = connection.prepareStatement(Constant.SELECT_FROM_TRAINER_LOGIN_ALL);
					ResultSet rs = stmt.executeQuery();

					if (rs.next()) {
						if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
							String getId = rs.getString(3);
							PreparedStatement stmt2 = connection.prepareStatement(Constant.SELECT_FROM_TRAINER_INNER_JOIN_TRAINER_LOGIN_ON_TRAINER_TRAINER_ID_TRAINER_LOGIN_TRAINER_LOGIN_ID_WHERE_TRAINER_ID);
							stmt2.setString(1, getId);
							ResultSet rs3 = stmt2.executeQuery();
							while (rs3.next()) {
								log.info(Constant.YOUR_DETAILS);
								System.out.println();
								log.info(Constant.WELCOME + rs.getString(1));
								System.out.println();
								System.out.format("%-5s %-8s %-8s %-8s %-5s %-8s %-8s", rs3.getString(1),
										rs3.getString(2), rs3.getString(3), rs3.getString(4), rs3.getString(5),
										rs3.getString(6), rs3.getString(7));
								System.out.println();
								System.out.println();
								log.info(Constant.NO_PROVISION_FOR_UPDATION_OR_INSERTION_OR_DELETION);
								System.out.println();
							}
							log.info(Constant.ENTER_ADMIN_CREDENTIAL);
						} else {
							log.info(Constant.INVALID_CREDENTIAL_S_ENTER_VALID_CREDENTIAL_S);
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		} while (Check == 0);

	}
}
