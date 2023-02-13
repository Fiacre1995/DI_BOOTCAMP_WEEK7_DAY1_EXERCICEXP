package Exercice4;

public class Computer {

	private int numero;
	private String proprietaire;
	private double statut;

	// Constructeur sans parametres
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructeur avec parametres

	public Computer(int numero, String proprietaire, double statut) {
		super();
		this.numero = numero;
		this.proprietaire = proprietaire;
		this.statut = statut;
	}

	// Getters et Setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public double getStatut() {

		return this.statut;

	}

	public void setStatut(double statut) {
		this.statut = statut;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public void getInfo() {

	}

}
