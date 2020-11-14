package DAO;

import Models.Magasin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MagasinDAO {
	static Connection connection = DB.getDB();
	
	public static Magasin getOne(int id) {
		try {
			String query = "SELECT * FROM t_magasins WHERE id_magasin = ";
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(query + id);
			while (resultSet.next()) {
				return new Magasin(
						resultSet.getInt(1),
						resultSet.getInt(2),
						resultSet.getString(3),
						resultSet.getString(4)
				);
			}
			return null;
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			return null;
		}
	}
}
