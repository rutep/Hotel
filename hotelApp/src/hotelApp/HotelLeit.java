package hotelApp;

public class HotelLeit extends Hotel {
	
	private int herbergisTeg;
	private boolean sortPrice;
	private boolean sortStars;
	private String flokkaHvad;
	
	public HotelLeit() {
		setName("");
		setLandshluti("Select an area");
		setVegan(false);
		setPool(false);
		setBreakfast(false);
		setWifi(false);
		setSpa(false);
		setHandicapped(false);
		setStars(5);
		setGym(false);
		setCarParking(false);
		setPets(false);
		herbergisTeg = 0;
		sortPrice = true;
		sortStars = true;
		flokkaHvad = "price";
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
	
	public void setFlokkaHvad(String s) {
		flokkaHvad = s;
	}
	
	public String getFlokkaHvad() {
		return flokkaHvad;
	}
}
