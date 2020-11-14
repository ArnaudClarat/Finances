package DAO;

import Models.Facture;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FactureDAO {
	static Connection connection = DB.getDB();
	
	public static Facture getOne(int id) {
		try {
			String query = "SELECT * FROM t_factures WHERE id_facture = ";
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(query + id);
			while (resultSet.next()) {
				return new Facture(
						resultSet.getInt(1),
						resultSet.getInt(2),
						resultSet.getDate(3),
						resultSet.getDouble(4)
				);
			}
			return null;
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
	
	static public List<Facture> getMonth() {
		try {
			String query = "SELECT * FROM t_factures WHERE MONTH(date_facture) = MONTH(CURDATE())";
			return getFactures(query);
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
	
	static public List<Facture> getYear() {
		try {
			String query =  "SELECT * FROM t_factures WHERE YEAR(date_facture) = YEAR(CURDATE())";
			return getFactures(query);
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
	
	private static List<Facture> getFactures(String query) throws SQLException {
		List<Facture> factures = new ArrayList<>();
		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
		while (resultSet.next()) {
			factures.add(new Facture(
					resultSet.getInt(1),
					resultSet.getInt(2),
					resultSet.getDate(3),
					resultSet.getDouble(4)
			));
		}
		return factures;
	}
}
