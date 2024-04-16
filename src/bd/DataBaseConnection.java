package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	
	public Connection dataBaseLink;
	
	public Connection getConnection() {
		String dataBaseName ="pokemon";
		String dataBaseUser ="root";
		String dataBasePass ="";
		String url = "jdbc:mysql://localhost/"+dataBaseName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dataBaseLink = DriverManager.getConnection(url,dataBaseUser, dataBasePass);
			System.out.println("Conexión establecida");
			
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return dataBaseLink;
	}

}
