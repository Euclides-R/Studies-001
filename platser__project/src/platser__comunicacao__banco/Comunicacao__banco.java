package platser__comunicacao__banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Comunicacao__banco {
	
	private static Connection con = null;
	
	public Comunicacao__banco(String msg) {
		// TODO Auto-generated constructor stub
	}

	public Connection conectarBanco() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/faculdade"; // 2
			con = DriverManager.getConnection(url, "postgres", "#euclidesRSTUDIES");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

