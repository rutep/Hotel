package hotelApp;

public class HotelManager {
	private DbManager manager = new DbManager();
	
	public Object[] searchForHotelInDb(HotelLeit h) {
		try {
		Object[] res = manager.runQuery(manager.makeSearchQuery(h));
		return res;
		} catch (ClassNotFoundException e) {
	 	// TODO Auto-generated catch block
			e.printStackTrace();
			return new Object[] {"error"};
		}
	}
	public void bokaHotel(String[] s) {
		try {
		manager.boka(manager.runBoka(s));
		} catch (ClassNotFoundException e) {
	 	// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
