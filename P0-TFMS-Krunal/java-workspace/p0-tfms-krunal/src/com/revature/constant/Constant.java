package com.revature.constant;

public class Constant {
	
//	This constants are used in Abstract class (model/TrainerDetails)
	public String ENTERTRAINERID = "Enter Id: ";
	public String ENTERTRAINERNAME = "Enter Name: ";
	public String ENTERTRAINERTRACK = "Enter Track(MUST be JAVA or DOTNET or MAINFRAME or TESTING): ";
	public String ENTERTRAINERQUALIFICATION = "Enter Qualification: ";
	public String ENTERTRAINEREXPERIENCE = "Enter Experience: ";
	public String ENTERTRAINERPHONUMBER = "Enter Phone Number: ";
	public String ENTERTRAINEREMAIL = "Enter Email: ";

//	This constants are used in Menu class (model/Menu)
	public String MENU = "************* MENU *************\n";
	public String MENUADDDETAILS = "Press 1: Add Trainer details";
	public String MENUTRAINERDETAILS = "Press 2: Show Trainer details";
	public String MENUDELETETRAINERDETAILS = "Press 3: Delete Trainer details";
	public String MENUUPDATETRAINERDETAILS = "Press 4: Update Trainer details";
	
//	This constants are used in Menu class (model/callMenu)
	public String CALLMENU = "Press 1: View Menu\nPress 2: Exit";
	public String THANKYOU = "********* Thank You *********";

	
//	This constants are used in switch statement of Main Application (model/SWITCH)
	public String SWITCHADDDETAILS = "************* ADD DETAILS *************\n";
	public String SWITCHTRAINERDETAILS = "************* TRAINER DETAILS *************\n";
	public String SWITCHDELETETRAINERDETAILS = "************* DELETE TRAINER DETAILS *************\n";
	public String SWITCHUPDATETRAINERDETAILS = "************* UPDATE TRAINER DETAILS *************\n";
	
// This constant is used for Default
	public String DEFAULTKEY = "Please press valid key !";
	
// This constant is used for checking condition (model/TrainerDetails/ChildTrainerDetails/addDetails()/ do loop)
	public String  CHECKCONDITIONADD= "If you want to add more data press: 1 or 0 !";
	public String  CHECKCONDITIONUPDATION= "If you want to update more data press: 1 or 0 !";
	
// This constant is used for checking valid data (model/TrainerDetails/ChildTrainerDetails/addDetails()/do loop/do loop )
	public String VALID = "Please Enter Valid Data !";
	
//	SuccessFull message 
	public String SUCCESS = "Operation Successfully done";
	
//	This constants are used in editTrainerDetails() method
	public String CHOOSE= "Which field you want to update \nPress 1: Update Name\nPress 2: Update Track\nPress 3: Update Qualification\nPress 4: Update Experience\nPress 5: Update Phone\nPress 6: Update Email";

}
