package Models;

import java.util.Date;

public class Revenu {
	int id;
	Date date;
	double montant;
	String communication;
	
	public Revenu(int id, Date date, double montant, String communication) {
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.communication = communication;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public String getCommunication() {
		return communication;
	}
}
