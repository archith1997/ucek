
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection conn = null;

	// Db connection credential
	private static String hostname = "localhost:3306";
	private static String dbName = "OnlineStore";
	private static String url = "jdbc:mysql://" + hostname + "/" + dbName;
	private static String username = "archith";
	private static String password = "pass";

	public static Connection getconnection() {

		// if connection is not created then only create a new connection
		if (conn == null) {
			try {
				conn = (Connection) DriverManager.getConnection(url, username, password);
				System.out.println("MarketPlace Database connected!!");

			} catch (SQLException e) {

				throw new IllegalStateException("Cannot connect the database!", e);
			}
		}

		// or return already created connection
		return conn;
	}// getconnection

}// class DatabaseConnection
