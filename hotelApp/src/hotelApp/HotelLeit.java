package hotelApp;

public class HotelLeit extends Hotel {
	
	private int herbergisTeg;
	private boolean sortPrice;
	private boolean sortStars;
	
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
		setPets(false);
		setSortPrice(false);
		setSortStars(false);
	}
	
	public void setHerbergisTeg(int h) {
		herbergisTeg = h;
	}
	
	public int getHerbergisTeg() {
		return herbergisTeg;
	}
	
	public void setSortPrice(boolean s) {
		sortPrice = s;
	}
	public boolean getSortPrice() {
		return sortPrice;
	}
	
	public void setSortStars(boolean s) {
		sortStars = s;
	}
	
	public boolean getSortStars() {
		return sortStars;
	}
}
