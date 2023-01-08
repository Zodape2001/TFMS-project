package com.revature.model;

public class TrainerDetails {
	private int trainerId;
	private String trainerName;
	enum track { 
		Java, Dotnet, Mainframe, Testing 
		}	
	private String qualification;
	private int experience;
	private int phone;
	private String email;
	public TrainerDetails(int trainerId, String trainerName, String qualification, int experience, int phone,
			String email) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.qualification = qualification;
		this.experience = experience;
		this.phone = phone;
		this.email = email;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
