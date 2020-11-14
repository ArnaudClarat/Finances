package DAO;

import Models.Enseigne;

import java.sql.*;

public class EnseigneDAO {
	static Connection connection = DB.getDB();
	
	public static Enseigne getOne(int id) {
		try {
			String query = "SELECT * FROM t_enseignes WHERE id_enseigne = ";
			Statement stmt = connection.createStatement();
			ResultSet rS = stmt.executeQuery(query + id);
			while (rS.next()) {
				return new Enseigne(
						rS.getInt("id_enseigne"),
						rS.getString("nom_enseigne")
				);
			}
			return null;
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
	
	public static boolean newEnseigne(String nom) {
		try {
			
			assert connection != null;
			String query = "INSERT INTO t_enseignes (`nom_enseigne`) VALUE (?)";
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, nom);
			return true;
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return false;
		}
	}
}
