package com.revature.constant;

public class Constant {
	
//	This constants are used in Abstract class (model/TrainerDetails)
	public String ENTERTRAINERID = "Enter Your Id: ";
	public String ENTERTRAINERNAME = "Enter your Name: ";
	public String ENTERTRAINERTRACK = "Enter your Track(MUST be JAVA or DOTNET or MAINFRAME or TESTING): ";
	public String ENTERTRAINERQUALIFICATION = "Enter your Qualification: ";
	public String ENTERTRAINEREXPERIENCE = "Enter your Experience: ";
	public String ENTERTRAINERPHONUMBER = "Enter your Phone Number: ";
	public String ENTERTRAINEREMAIL = "Enter your Email: ";

//	This constants are used in Main Application (model/SWITCH)
	public String APPLICATIONSHMENU = "************* MENU *************\n";
	public String APPLICATIONADDDETAILS = "Press 1: Add Trainer details";
	public String APPLICATIONTRAINERDETAILS = "Press 2: Show Trainer details";
	public String APPLICATIONDELETETRAINERDETAILS = "Press 3: Delete Trainer details";
	public String APPLICATIONUPDATETRAINERDETAILS = "Press 4: Update Trainer details";
	
//	This constants are used in switch statement of Main Application (model/SWITCH)
	public String SWITCHADDDETAILS = "************* ADD DETAILS *************\n";
	public String SWITCHTRAINERDETAILS = "************* TRAINER DETAILS *************\n";
	public String SWITCHDELETETRAINERDETAILS = "************* DELETE TRAINER DETAILS *************\n";
	public String SWITCHUPDATETRAINERDETAILS = "************* UPDATE TRAINER DETAILS *************\n";
	
// This constant is used for Default
	public String DEFAULTVALUE = "Please press valid key !";
	
// This constant is used for checking condition (model/TrainerDetails/ChildTrainerDetails/addDetails()/ do loop)
	public String  CHECKCONDITION= "If you want to add more data press: 1 or 0 !";
}