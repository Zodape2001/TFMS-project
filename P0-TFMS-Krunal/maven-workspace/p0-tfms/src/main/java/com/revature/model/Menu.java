package com.revature.model;

import java.util.Scanner;

import org.apache.log4j.Logger;
import com.revature.constant.Constant;
import com.revature.dao.TrainerDetails;
import com.revature.service.impl.*;
import com.reveture.dao.impl.TrainerDetailsImpl;

public class Menu {
	Scanner scInt = new Scanner(System.in);
	TrainerDetails ctd = new TrainerDetailsImpl();
	private static  Logger log = Logger.getLogger(Menu.class);
	public void menuList() throws Exception {

		log.info(Constant.EQUALSTYLE);
		log.info(Constant.MENU);
		log.info(Constant.EQUALSTYLE);
		log.info(Constant.MENUADDDETAILS);
		log.info(Constant.MENUTRAINERDETAILS);
		log.info(Constant.MENUDELETETRAINERDETAILS);
		log.info(Constant.MENUUPDATETRAINERDETAILS);
		log.info(Constant.MENULOGOUT);
		log.info(Constant.MENUREGISTER);

		int press = scInt.nextInt();
		switch (press) {
		case 1:
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.SWITCHADDDETAILS);
			log.info(Constant.EQUALSTYLE);
			ctd.addDetails();
			break;
		case 2:
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.SWITCHTRAINERDETAILS);
			log.info(Constant.EQUALSTYLE);
			ctd.showTrainerDetails();
			break;
		case 3:
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.SWITCHDELETETRAINERDETAILS);
			log.info(Constant.EQUALSTYLE);
			ctd.deleteTrainerDetails();
			break;
		case 4:
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.SWITCHUPDATETRAINERDETAILS);
			log.info(Constant.EQUALSTYLE);
			ctd.editTrainerDetails();
			break;
		case 5:
			LoginImpl loginImpl = new LoginImpl();
			loginImpl.login();
			break;
		case 6:
			log.info(Constant.EQUALSTYLE);
			log.info(Constant.REGISTER_TRAINER);
			log.info(Constant.EQUALSTYLE);
			ctd.registerTrainer();			
			break;
		default:
			log.info(Constant.DEFAULTKEY);
		}
	}

}
