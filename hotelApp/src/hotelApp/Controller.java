package hotelApp;

public class Controller {
	private HotelManager manager = new HotelManager();
	public Object[] search(Object[] s) {
		// test - Object[] lausn = new Object[] {"la"};
		return manager.searchForHotelInDb(s);
	}	
}
