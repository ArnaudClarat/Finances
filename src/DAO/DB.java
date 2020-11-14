package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private static Connection conn = getConn();
	
	public static Connection getDB() {
		return conn;
	}
	
	private static Connection getConn() {
		try {
			System.out.println("Loading driver");
			Class.forName("com.mysql.cj.jdbc.Driver"); // Chargement du driver
			System.out.println("Driver loaded");
			
			System.out.println("Connection..");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finances?serverTimezone=UTC", "root", ""); // Connexion à la DB
			System.out.println("Connection done\n");
			
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot connect to the database! Class");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Cannot connect to the database! SQL ");
			e.printStackTrace();
			return null;
		}
	}
}
