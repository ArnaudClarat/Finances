package Models;

public class Enseigne {
	private int id;
	private String nom;
	
	public Enseigne(int ID, String nom) {
		this.id = ID;
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
}


