package Models;

import DAO.EnseigneDAO;

public class Magasin {
	private int id;
	private Enseigne enseigne;
	private String nom;
	private String adresse;
	
	public Magasin(int id, int enseigne, String nom, String adresse) {
		this.id = id;
		this.enseigne = EnseigneDAO.getOne(enseigne);
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public int getId() {
		return id;
	}
	
	public Enseigne getEnseigne() {
		return enseigne;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
