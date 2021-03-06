
package hotelApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DbManager {
	
	/**
	 * Fall sem sér um alla leit og skilar hótelum með þeim leitarskilirðum
	 * @param HotelLeit s hlutur sem inniheldur leitar upplísingar
	 * @return
	 */
	public String makeSearchQuery(HotelLeit s){
		
		 String name = s.getName();
		 String vegan, swimmingPool,breakfast,freeWifi,spa,handiCappedAcc,gym,carParking,
		 pets,landshluti,stars,herbergisTeg,sort,flokkaHvad,flokkaHvernig;

		 if (!s.getVegan()) vegan=""; 					else vegan="AND vegan='true'";
		 if (!s.getPool()) swimmingPool=""; 			else swimmingPool="AND swimmingPool='true'";
		 if (!s.getBreakfast()) breakfast=""; 			else breakfast="AND breakfast='true'";
		 if (!s.getFreeWifi()) freeWifi=""; 			else freeWifi="AND freeWifi='true'";
		 if (!s.getSpa()) spa=""; 						else spa="AND spa='true'";
		 if (!s.getHandicapped()) handiCappedAcc=""; 	else handiCappedAcc="AND handicappedAcc='true'";
		 stars="AND stars<=" + s.getStars() + " ";
		 if (!s.getGym()) gym=""; 						else gym="AND gym='true'";
		 if (!s.getParking()) carParking=""; 			else carParking="AND carParking='true'";
		 if (!s.getPets()) pets="";						else pets="AND pets='true'";
		 if (s.getLandshluti()=="Select an area") landshluti=""; else landshluti = "AND landshluti='" + s.getLandshluti() + "' ";
		 if (s.getHerbergisTeg()==0)					herbergisTeg="singlePrice";
		 else if (s.getHerbergisTeg()==1)				herbergisTeg="doublePrice";
		 else											herbergisTeg="suitePrice";

		 if (s.getFlokkaHvad() == "price") {
			 flokkaHvad = herbergisTeg;
			 if (s.getSortPrice()) 	flokkaHvernig = "ASC";
			 else 					flokkaHvernig = "DESC";			 
		 }
		 else {
			 flokkaHvad = "stars";
			 if (s.getSortStars())	flokkaHvernig = "ASC";
			 else 					flokkaHvernig = "DESC";
		 }
		 sort = "ORDER BY " + flokkaHvad + " " + flokkaHvernig;
		 
		 
		 return "select * from hotel where name like '%" + name + "%'" + vegan + swimmingPool +
			breakfast + freeWifi + spa + handiCappedAcc + stars + gym + carParking + pets + landshluti + sort;

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
				// System.out.println("ssn = " + resultSet.getInt("ssn"));
				// System.out.println("name = " + resultSet.getString("name"));
				Hotel res = new Hotel(resultSet.getString("name"),resultSet.getInt("ssn"),resultSet.getInt("stars"));
				res.setSinglePrice(resultSet.getString("singlePrice"));
				res.setDoublePrice(resultSet.getString("doublePrice"));
				res.setSuitePrice(resultSet.getString("suitePrice"));
				res.setAddress(resultSet.getString("address"));
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
	public String runBoka(RoomReservation s) {
		String name, ssn;
		int hotelssn, roomtype;
		name = s.getGuest().getName();
		ssn = s.getGuest().getSsn();
		hotelssn = s.getHotel().getHotelId();
		roomtype = s.getHerbergisTeg();
		return "INSERT INTO PERSON VALUES ('" + name + "','" + ssn + "'," + hotelssn + "," + roomtype + ");";
	}
		
	
	public void boka(String s)  throws ClassNotFoundException { {
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
			statement.executeUpdate(s);
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
		
	}
}
}



