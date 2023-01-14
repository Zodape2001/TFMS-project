package com.revature.model;
import java.util.Scanner;
import com.revature.constant.Constant; //Importing "Constant" class of com.revature.constant where all constants are hardcoded

public class Menu {
	public void menuList() {
//		Creating "constant" object of Constant class
		Constant constant = new Constant();		
		
		Scanner scInt = new Scanner(System.in);
		
//		Printing constant/variable which are hardcoded in "Constant" class of com.revature.constant package because if 
//		any changes required in future no need to search the constant/variable in the entire file just go to the "Constant" class of 
//		com.revature.constant package and change there only, It will reflect everywhere.
		
		System.out.println(constant.APPLICATIONSHMENU);
		System.out.println(constant.APPLICATIONADDDETAILS);	
		System.out.println(constant.APPLICATIONTRAINERDETAILS);
		System.out.println(constant.APPLICATIONDELETETRAINERDETAILS);
		System.out.println(constant.APPLICATIONUPDATETRAINERDETAILS);
		
//		Creating an object of "ChildTrainerDetails" which is a child of an interface "TrainerDetails" where all CRUD methods 
//		are stored as an abstract method 
		ChildTrainerDetails ctd = new ChildTrainerDetails();
		
//		Taking user input for chaking switch case.
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
		scInt.close();

	}
}