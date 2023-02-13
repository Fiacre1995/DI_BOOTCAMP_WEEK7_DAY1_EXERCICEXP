package com.exercicexp;

public class Exercice1 {

	// Attributs

	private int x;
	private int y;

	// Constructeur sans parametre

	public Exercice1() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructeur avec parametre

	public Exercice1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Getters et Setters

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Main

	@Override
	public String toString() {
		return "Exercice1 [x=" + x + ", y=" + y + "]";
	}

	public void distance() {

		int resultat = this.y - this.x;
		System.out.println(resultat);

	}

	public void distance(int x, int y) {

		int resultat = this.y - this.x;
		System.out.println(resultat);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercice1 distance1 = new Exercice1(5, 20);
		distance1.distance();

	}

}
