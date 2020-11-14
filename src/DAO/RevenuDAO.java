package DAO;

import Models.Revenu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RevenuDAO {
	static Connection connection = DB.getDB();
	
	public static Revenu getOne(int id) {
		try {
			String query = "SELECT * FROM t_revenus WHERE id_revenu = ";
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(query + id);
			while (resultSet.next()) {
				return new Revenu(
						resultSet.getInt(1),
						resultSet.getDate(2),
						resultSet.getInt(3),
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
