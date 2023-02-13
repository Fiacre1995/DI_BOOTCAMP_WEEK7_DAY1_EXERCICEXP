package com.exercice3;

public class Car extends Vehicule {
	
	private String name;
	
	//Constructeur sans parametre
	
	public Car() {
		super();
		
	}
	
	
	
	
	public void getDetails(String carName) {
		
		System.out.println("name :" + carName + " model " + this.getModel() + " speed " + this.getSpeed() );
		
	}
	
	

}
