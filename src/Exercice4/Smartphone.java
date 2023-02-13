package Exercice4;

public class Smartphone extends Computer{
	
	private String marque;

	public Smartphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void getInfoSmartphone(String _marque) {
		
		System.out.println("marque : " + _marque + " numero : " + this.getNumero() + " proprietaire : " + this.getProprietaire() + " Statut : " + this.getStatut());
		
	}
	

}
