package fouzi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ReservationdbManagement {
	
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String DB_PASSWORD = "";
	
	public static Connection getConnection()throws SQLException{
		
		return DriverManager.getConnection(URL,USER,DB_PASSWORD);
		
		
	}

}
