package hotelApp;

public class HotelManager {
	private DbManager manager = new DbManager();
	
	public Object[] searchForHotelInDb(Object[] s) {
		try {
		Object[] res = manager.runQuery(manager.makeSearchQuery((String)s[0]));
		return res;
		} catch (ClassNotFoundException e) {
	 	// TODO Auto-generated catch block
			e.printStackTrace();
			return new Object[] {"error"};
		}
	}
}
