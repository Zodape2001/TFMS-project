package com.revature.model;
import java.util.Scanner;
import com.revature.constant.Constant;
import com.revature.service.impl.TrainerDetailsImpl;

import static java.lang.System.*;


public class Menu {
	
	Scanner scInt = new Scanner(System.in);
	Constant constant = new Constant();	
	
	public void menuList() {
 
		TrainerDetailsImpl ctd = new TrainerDetailsImpl();
		
		out.println(constant.MENU);
		out.println(constant.MENUADDDETAILS);	
		out.println(constant.MENUTRAINERDETAILS);
		out.println(constant.MENUDELETETRAINERDETAILS);
		out.println(constant.MENUUPDATETRAINERDETAILS);		
		
		int press = scInt.nextInt();
		switch(press)
		{
			case 1:
				out.println(constant.SWITCHADDDETAILS); 
				ctd.addDetails();
				break;
			case 2: 
				out.println(constant.SWITCHTRAINERDETAILS);
				ctd.showTrainerDetails();
				break;
			case 3:
				out.println(constant.SWITCHDELETETRAINERDETAILS);
				ctd.deleteTrainerDetails();
				break;
			case 4:
				out.println(constant.SWITCHUPDATETRAINERDETAILS);
				ctd.editTrainerDetails();
				break;
//			case 5:
//				ArrayListSort();
//				break;
			default:
				out.println(constant.DEFAULTKEY);
		}
	}
	
	public void callMenu() {
		out.println(constant.CALLMENU);
		int press = scInt.nextInt();
		if(press==1) {
			Menu menu = new Menu();
			menu.menuList();
		}
		else {
			out.println(constant.THANKYOU);
		}
	}
}
