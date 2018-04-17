
package hotelApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DbManager {
	
	public String makeSearchQuery(HotelLeit s){
		
		 // *************************** Haukur ******************************************
		 String name = s.getName();
		 String vegan, swimmingPool,breakfast,freeWifi,spa,handiCappedAcc,gym,carParking;
		 String stars = "";
		 if (!s.getVegan()) vegan=""; else vegan="AND vegan='true'";
		 if (!s.getVegan()) swimmingPool=""; else swimmingPool="AND swimmingPool='true'";
		 if (!s.getBreakfast()) breakfast=""; else breakfast="AND breakfast='true'";
		 if (!s.getFreeWifi()) freeWifi=""; else freeWifi="AND freeWifi='true'";
		 if (!s.getSpa()) spa=""; else spa="AND spa='true'";
		 if (!s.getHandicapped()) handiCappedAcc=""; else handiCappedAcc="AND handicappedAcc='true'";
		 stars="AND stars<=" + s.getStars() + " ";
		 if (!s.getGym()) gym=""; else gym="AND gym='true'";
		 if (!s.getParking()) carParking=""; else carParking="AND carParking='true'";
		 return "select name, ssn, stars from hotel where name like '%" + name + "%'" + vegan + swimmingPool +
			breakfast + freeWifi + spa + handiCappedAcc + stars + gym + carParking;

		 //return "select name, ssn, stars from hotel where name like '%" + name + "%'";
		}
		/**

		 * 
		 * @param s
		 */
	public Object[] runQuery(String s) throws ClassNotFoundException {
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");
		Connection connection = null;
		Vector<Object> vec = new Vector<Object>();
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
				Hotel res = new Hotel(resultSet.getString("name"),resultSet.getInt("ssn"),resultSet.getInt("stars"));
				vec.add(res);
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
		return vec.toArray();
	}
}



