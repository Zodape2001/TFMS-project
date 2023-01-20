package com.revature.constant;

public class Constant {
//	Username and password
	public static String USERNAME= "admin";
	public static final String PASSWORD= "admin@1234";

//	LoginImpl constant
	public static final String INVALID_CREDENTIAL_S_ENTER_VALID_CREDENTIAL_S = "Invalid Credential's \u274C \uD83D\uDE22\n\n================================\nEnter valid Credential's\n";
	public static final String NO_PROVISION_FOR_UPDATION_OR_INSERTION_OR_DELETION = "No provision for updation or insertion or deletion \uD83D\uDE10";
	public static final String WELCOME = "Welcome ";
	public static final String YOUR_DETAILS = "=========== Your Details ===========";
	public static final String SELECT_FROM_TRAINER_INNER_JOIN_TRAINER_LOGIN_ON_TRAINER_TRAINER_ID_TRAINER_LOGIN_TRAINER_LOGIN_ID_WHERE_TRAINER_ID = "select * from trainer inner join trainer_login on trainer.trainer_id = trainer_login.trainer_login_id where trainer_id = ?;";
	public static final String SELECT_FROM_TRAINER_LOGIN_ALL = "select * from trainer_login";	
	public static final String SELECT_FROM_TRAINER_LOGIN = "Select * from trainer_login where trainer_login_username = ?";
	public static final String LOGIN_SUCCESSFULL = "Login successfull \u2713 \ud83d\ude00";
	public static final String ENTER_PASSWORD_LOGINIMPL = "Enter Password: ";
	public static final String ENTER_USERNAME_LOGINIMPL = "Enter Username: ";
	public static final String LOGIN = "             Login";
	public static final String ENTER_ADMIN_CREDENTIAL = "================================\nEnter Admin's Credential's for making changes\n";

	
//	This constants are used in registerTrainer() method
	public static final String DATA_NOT_INSERTED = "Data not Inserted\nPlease press 1!";
	public static final String DATA_INSERTED = "Data Inserted !";
	public static final String REGISTER_TRAINER_QUERRY = "INSERT INTO `tfms_db_krunal`.`trainer_login` (`trainer_login_username`,`trainer_login_password`,`trainer_login_id`) VALUES (?,?,?)";
	public static final String ENTER_ID_OF_TRAINER = "Enter Id of Trainer: ";
	public static final String ENTER_PASSWORD = "Enter Password: ";
	public static final String ENTER_USERNAME = "Enter username: ";
	
//	This constants are used in addDetails() method
	public static final String ENTERTRAINERID = "Enter Id: ";
	public static final String ENTERTRAINERNAME = "Enter Name: ";
	public static final String ENTERTRAINERTRACK = "Enter Track(MUST be JAVA or DOTNET or MAINFRAME or TESTING): ";
	public static final String ENTERTRAINERQUALIFICATION = "Enter Qualification: ";
	public static final String ENTERTRAINEREXPERIENCE = "Enter Experience: ";
	
//	This constants are used in showTrainerDetails() method
	public static final String SELECT_FROM_TRAINER = "SELECT * FROM trainer";

//	This constants are used in deleteTrainerDetails() method
	public static final String NOT_DELETED = "Not deleted !";
	public static final String DELETED_SUCCESSFULLY = "Deleted successfully";
	public static final String DELETE_FROM_TRAINER_WHERE_TRAINER_ID = "delete from trainer where trainer_id=?";
	public static final String ENTER_ID_OF_TRAINER_TO_DELETE = "Enter Id of trainer to delete: ";

//	This constants are used in editTrainerDetails() method
	public static final String ENTER_ID_OF_TRAINER_UPDATE = "Enter Id of Trainer: ";
	public static final String PRESS_VALID_KEY = "Press valid key !";
	public static final String UPDATE_TRAINER_EXPERIENCE = "update trainer set trainer_exp=? where trainer_id=?";
	public static final String ENTER_NEW_EXPERIENCE = "Enter new experience:";
	public static final String UPDATE_TRAINER_QUALIFICATION = "update trainer set trainer_qual=? where trainer_id=?";
	public static final String ENTER_NEW_QUALIFICATION = "Enter new qualification:";
	public static final String UPDATE_TRAINER_TRACK = "update trainer set trainer_track=? where trainer_id=?";
	public static final String ENTER_NEW_TRACK = "Enter new track:";
	public static final String NOT_UPDATED = "Not updated";
	public static final String UPDATED = "Updated";
	public static final String UPDATE_TRAINER_NAME = "update trainer set trainer_name=? where trainer_id=?";
	public static final String ENTER_NEW_NAME = "Enter new name:";

	//	This constants are used in Menu class (model/Menu)
	public static final String MENU = "            MENU         ";
	public static final String MENUADDDETAILS = "Press 1: Add Trainer details";
	public static final String MENUTRAINERDETAILS = "Press 2: Show Trainer details";
	public static final String MENUDELETETRAINERDETAILS = "Press 3: Delete Trainer details";
	public static final String MENUUPDATETRAINERDETAILS = "Press 4: Update Trainer details";
	public static final String MENULOGOUT = "Press 5: Logout";
	public static final String MENUREGISTER = "Press 6: Register Trainer";
	public static final String REGISTER_TRAINER = "Register Trainer";

	
//	This constants are used in Menu class (model/callMenu)
	public static final String CALLMENU = "Press 1: View Menu\nPress 2: Logout";
	public static final String THANKYOU = "           Thank You          ";

	
//	This constants are used in switch statement of Main Application (model/SWITCH)
	public static final String EQUALSTYLE = "================================";
	public static final String SWITCHADDDETAILS = "         ADD DETAILS         ";
	public static final String SWITCHTRAINERDETAILS = "         TRAINER DETAILS         ";
	public static final String SWITCHDELETETRAINERDETAILS = "   DELETE TRAINER DETAILS   ";
	public static final String SWITCHUPDATETRAINERDETAILS = "   UPDATE TRAINER DETAILS   ";
	
// This constant is used for Default
	public static final String DEFAULTKEY = "Please press valid key !";
	
// This constant is used for checking condition (model/TrainerDetails/ChildTrainerDetails/addDetails()/ do loop)
	public static final String  CHECKCONDITIONADD= "If you want to add more data press: 1 or 0 !";
	public static final String  CHECKCONDITIONUPDATION= "If you want to update more data press: 1 or 0 !";
	
// This constant is used for checking valid data (model/TrainerDetails/ChildTrainerDetails/addDetails()/do loop/do loop )
	public static final String VALID = "Please Enter Valid Data !";
	
//	SuccessFull message 
	public static final String SUCCESS = "Operation Successfully done";
	
//	This constants are used in editTrainerDetails() method
	public static final String CHOOSE= "Which field you want to update \nPress 1: Update Name\nPress 2: Update Track\nPress 3: Update Qualification\nPress 4: Update Experience\nPress\n";
	public static final String CHOOSEADMIN= "              Login";

	public static final String  SELECT_ALL_QUERY="SELECT `trainer_id`,`trainer_name`,`trainer_track`,`trainer_qual`,`trainer_exp` FROM `tfms_db_krunal`.`trainer` ";
	public static final String  SELECT_SPECIFIC_QUERY="SELECT `Associate_id`,`Associate_name`,`Associate_track`,`Associate_qualification`,`Associate_experience` FROM `tfms`.`associate`";
	public static final String  INSERT_QUERY="INSERT INTO `tfms_db_krunal`.`trainer` (`trainer_id`,`trainer_name`,`trainer_track`,`trainer_qual`,`trainer_exp`) VALUES (?,?,?,?,?) ";
	public static final String  UPDATE_QUERY="UPDATE `tfms`.`associate` SET `PASSWORD`=? , `LAST_MODIFIED`=? WHERE `Associate_Id`=? ";
	public static final String  DELETE_QUERY="DELETE FROM `tfms`.`associate` WHERE `Associate_Id`=? ";
}
