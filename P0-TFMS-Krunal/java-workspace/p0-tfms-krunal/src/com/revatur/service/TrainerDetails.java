package com.revatur.service;

import java.util.ArrayList;

import com.revature.model.Trainer;

public interface TrainerDetails {
	static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

	public abstract void addDetails();

	public abstract void showTrainerDetails();

	public abstract void deleteTrainerDetails();

	public abstract void editTrainerDetails();
}
