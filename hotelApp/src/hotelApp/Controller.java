package hotelApp;

public class Controller {
	private HotelManager manager = new HotelManager();
	public Object[] search(Object[] s) {
	
		return manager.dataHandler(s);
	}
}
