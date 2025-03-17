package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjemploSingleton {

	// PATRON DE DISEÑO
	// Propiedades
	private static Connection conn = null;
	private String url;
	private String usuario;
	private String password;

	// Constructor
	private EjemploSingleton() {
		url = "jdbc:mysql://localhost:3307/sakila";
		usuario = "root";
		password = "mysql";

		try {
			conn = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // Fin constructor

	// Métodos
	public static Connection getConnection() {

		if (conn == null) {
			new EjemploSingleton();
		}

		return conn;
	} // Fin getConnection
}
