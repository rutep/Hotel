package hotelApp;

public class HotelLeit extends Hotel {
	
	private int herbergisTeg;
	
	public HotelLeit() {
		setName("");
		setLandshluti(0);
		setVegan(false);
		setPool(false);
		setBreakfast(false);
		setWifi(false);
		setSpa(false);
		setHandicapped(false);
		setStars(5);
		setGym(false);
		setCarParking(false);
		setHerbergisTeg(0);
	}
	
	public void setHerbergisTeg(int h) {
		herbergisTeg = h;
	}
	
	public int getHerbergisTeg() {
		return herbergisTeg;
	}
}
