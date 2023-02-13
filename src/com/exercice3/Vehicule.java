package com.exercice3;



public class Vehicule {
	
	
	//Attributs 
	
	private String model;
	private double speed;
	
	//Controlleur sans parametre
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//Controlleur avec parametre
	
	public Vehicule(String model, double speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	
	//Getters et Setters
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}




	

	
	
}

