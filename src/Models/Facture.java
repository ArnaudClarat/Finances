package Models;

import DAO.MagasinDAO;

import java.util.Date;

public class Facture {
	int id;
	Date date;
	double total;
	Magasin magasin;
	
	public Facture(int id, int magasin, Date date, double total) {
		this.id = id;
		this.date = date;
		this.total = total;
		this.magasin = MagasinDAO.getOne(magasin);
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public double getTotal() {
		return total;
	}
	
	public Magasin getMagasin() {
		return magasin;
	}
	
	@Override
	public String toString() {
		return "Facture {" +
				"id = " + id +
				", date = " + date +
				", total = " + total +
				", magasin = " + magasin +
				'}';
	}
}
