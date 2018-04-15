package hotelApp;

public class HotelManager {
	private DbManager manager = new DbManager();
	
	public Object[] searchForHotelInDb(HotelLeit h) {
		try {
		Object[] res = manager.runQuery(manager.makeSearchQuery(h.getName()));
		return res;
		} catch (ClassNotFoundException e) {
	 	// TODO Auto-generated catch block
			e.printStackTrace();
			return new Object[] {"error"};
		}
	}
}
