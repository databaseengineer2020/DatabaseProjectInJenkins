/*package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	public static String getData(String columnName) throws ClassNotFoundException, SQLException{
		//Setting properties for mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating a connection to ypur local database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/august2020", "root", "root");
		//empowering the con reference variable to execute queries
		Statement smt = con.createStatement();
		//delivering the sql query
		ResultSet rs = smt.executeQuery("select * from users");
		while(rs.next()) {
			return rs.getString(columnName);
		}
		
		return columnName;
	}

}*/
