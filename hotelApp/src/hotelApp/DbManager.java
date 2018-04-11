package hotelApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	public String makeSearchQuery(String s){
		return "select name, ssn from hotel where name like '%" + s + "%'";
		}
	
	public Object[] runQuery(String s) throws ClassNotFoundException {
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		try
		{
			System.out.println(s);
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:hotelDataBase.db");
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout to 30 sec.
			
			// statement.executeUpdate("DROP TABLE IF EXISTS person");
			// statement.executeUpdate("CREATE TABLE person (id INTEGER, name STRING)");
			// int ids [] = {1,2,3,4,5};
			// String names [] = {"Peter","Pallar","William","Paul","James Bond"};
			/**
	  			for(int i=0;i<ids.length;i++){
					statement.executeUpdate("INSERT INTO person values(' "+ids[i]+"', '"+names[i]+"')");
	  			}
			 */
			//statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
			//statement.executeUpdate("DELETE FROM person WHERE id='1'");

      
			ResultSet resultSet = statement.executeQuery(s);
			while(resultSet.next())
			{
				// iterate & read the result set
				System.out.println("ssn = " + resultSet.getInt("ssn"));
				System.out.println("name = " + resultSet.getString("name"));
			}
		}
		catch(SQLException e){  System.err.println(e.getMessage()); }       
		finally {         
			try {
				if(connection != null)
					connection.close();  
			}
			catch(SQLException e) {  // Use SQLException class instead.          
				System.err.println(e); 
			}
		}
		return new Object[] {"Hilton"};
	}
}

