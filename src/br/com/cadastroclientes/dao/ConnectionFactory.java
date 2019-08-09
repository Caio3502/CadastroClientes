package br.com.cadastroclientes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
public static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		try {
			if (conn == null){
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cadastroClientes", "postgres", "seubaitola456");
			}
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new SQLException();
		}
	}
}
