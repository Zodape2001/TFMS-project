package com.revature.model;
import java.util.Scanner;
import com.revature.constant.Constant; //Importing "Constant" class of com.revature.constant where all constants are hardcoded

public class Menu {
	
	Scanner scInt = new Scanner(System.in);
	
	public void menuList() {
 
		Constant constant = new Constant();	
		ChildTrainerDetails ctd = new ChildTrainerDetails();
		
		System.out.println(constant.APPLICATIONSHMENU);
		System.out.println(constant.APPLICATIONADDDETAILS);	
		System.out.println(constant.APPLICATIONTRAINERDETAILS);
		System.out.println(constant.APPLICATIONDELETETRAINERDETAILS);
		System.out.println(constant.APPLICATIONUPDATETRAINERDETAILS);
		
		
		int press = scInt.nextInt();
		switch(press)
		{
			case 1:
				System.out.println(constant.SWITCHADDDETAILS); 
				ctd.addDetails();
				break;
			case 2:
				System.out.println(constant.SWITCHTRAINERDETAILS);
				ctd.showTrainerDetails();
				break;
			case 3:
				System.out.println(constant.SWITCHDELETETRAINERDETAILS);
				ctd.deleteTrainerDetails();
				break;
			case 4:
				System.out.println(constant.SWITCHUPDATETRAINERDETAILS);
				ctd.editTrainerDetails();
				break;
//			case 5:
//				ArrayListSort();
//				break;
			default:
				System.out.println(constant.DEFAULTVALUE);
		}
	}
	
	public void callMenu() {
		System.out.println("Press 1: View Menu\nPress 2: Exit");
		int press = scInt.nextInt();
		if(press==1) {
			Menu menu = new Menu();
			menu.menuList();
		}
		else {
			System.out.println("********* Thank You *********");
		}
	}
}
