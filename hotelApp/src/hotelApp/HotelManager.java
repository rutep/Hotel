package hotelApp;

public class HotelManager {
	private DbManager manager = new DbManager();
	public Object[] dataHandler(Object[] s) {
	
		return manager.runQuery(manager.makeSearchQuery((String)s[0]));
	}
}