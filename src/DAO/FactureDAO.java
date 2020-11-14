package DAO;

import Models.Facture;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
						resultSet.getDate(2),
						resultSet.getDouble(3),
						resultSet.getInt(4)
				);
			}
			return null;
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
}
