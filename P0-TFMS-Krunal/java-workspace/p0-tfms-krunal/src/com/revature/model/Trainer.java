package com.revature.model;

public class Trainer {
	private String trainerId;
	private String trainerName;
	private String trainerTrack;
	private String trainerQualification;
	private int trainerExperience;
	private String trainerPhone;
	private String trainerEmail;
	
	public Trainer(String trainerId, String trainerName, String trainerTrack, String trainerQualification,
			int trainerExperience, String trainerPhone, String trainerEmail) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerTrack = trainerTrack;
		this.trainerQualification = trainerQualification;
		this.trainerExperience = trainerExperience;
		this.trainerPhone = trainerPhone;
		this.trainerEmail = trainerEmail;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerTrack() {
		return trainerTrack;
	}

	public void setTrainerTrack(String trainerTrack) {
		this.trainerTrack = trainerTrack;
	}

	public String getTrainerQualification() {
		return trainerQualification;
	}

	public void setTrainerQualification(String trainerQualification) {
		this.trainerQualification = trainerQualification;
	}

	public int getTrainerExperience() {
		return trainerExperience;
	}

	public void setTrainerExperience(int trainerExperience) {
		this.trainerExperience = trainerExperience;
	}

	public String getTrainerPhone() {
		return trainerPhone;
	}

	public void setTrainerPhone(String trainerPhone) {
		this.trainerPhone = trainerPhone;
	}

	public String getTrainerEmail() {
		return trainerEmail;
	}

	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerTrack=" + trainerTrack
				+ ", trainerQualification=" + trainerQualification + ", trainerExperience=" + trainerExperience
				+ ", trainerPhone=" + trainerPhone + ", trainerEmail=" + trainerEmail + "]";
	}
		
}
