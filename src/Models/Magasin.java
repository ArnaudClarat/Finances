package Models;

import DAO.EnseigneDAO;

public class Magasin {
	int id;
	Enseigne enseigne;
	String Adresse;
	
	public Magasin(int id, int enseigne, String adresse) {
		this.id = id;
		this.enseigne = EnseigneDAO.getOne(enseigne);
		Adresse = adresse;
	}
	
	public int getId() {
		return id;
	}
	
	public Enseigne getEnseigne() {
		return enseigne;
	}
	
	public String getAdresse() {
		return Adresse;
	}
}
