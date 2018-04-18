package hotelApp;

public class Hotel {
	
	//Instance fields
	private String name;
	private int hotelId;
	private String address;
	private String town;
	private int landshluti;
	private boolean vegan;
	private boolean swimmingPool;
	private boolean breakfast;
	private boolean freeWifi;
	private boolean spa;
	private boolean handicappedAcc;
	private int stars;
	private boolean gym;
	private boolean carParking;
	private boolean singleBed;
	private boolean doubleBed;
	private boolean hotelSuite;
	private boolean petsAllowed;
	private String singlePrice;
	private String doublePrice;
	private String suitePrice;
	
	//Constructor ekki kl�ra�ur, �arf a� spyrja P�tur n�nar �t � hann
	//Spurningin er hva� n�kv�mlega �arf � smi�inn, er �a� meira en nafn
	public Hotel(String n, int i, int s) {
		this.name = n;
		this.stars = s;
		this.hotelId = i;

	}
	
	// Smi�ur fyrir h�tel leit
	public Hotel() {
		
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setHotelId(int s) {
		hotelId = s;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setTown(String t) {
		town = t;
	}
	
	public void setLandshluti(int l) {
		landshluti = l;
	}
	
	public void setVegan(boolean v) {
		vegan = v;
	}
	
	public void setPool(boolean p) {
		swimmingPool = p;
	}
	
	public void setBreakfast(boolean b) {
		breakfast = b;
	}
	
	public void setWifi(boolean w) {
		freeWifi = w;
	}
	
	public void setSpa(boolean s) {
		spa = s;
	}
	
	public void setHandicapped(boolean h) {
		handicappedAcc = h;
	}
	
	public void setStars(int s) {
		stars = s;
	}
	
	public void setGym(boolean g) {
		gym = g;
	}
	
	public void setCarParking(boolean c) {
		carParking = c;
	}
	
	public void setSingleBed(boolean s) {
		singleBed = s;
	}
	
	public void setDoubleBed(boolean d) {
		doubleBed = d;
	}
	
	public void sethotelSuite(boolean suite) {
		hotelSuite = suite;
	}
	
	public void setSinglePrice(String s) {
		singlePrice = s;
	}
	
	public void setDoublePrice(String string) {
		doublePrice = string;
	}
	
	public void setSuitePrice(String p) {
		suitePrice = p;
	}
	
	public void setPets(boolean p) {
		petsAllowed = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHotelId() {
		return hotelId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTown() {
		return town;
	}
	
	public int getLandshluti() {
		return landshluti;
	}
	
	public boolean getVegan() {
		return vegan;
	}
	
	public boolean getPool() {
		return swimmingPool;
	}
	
	public boolean getBreakfast() {
		return breakfast;
	}
	
	public boolean getFreeWifi() {
		return freeWifi;
	}
	
	public boolean getSpa() {
		return spa;
	}
	
	public boolean getHandicapped() {
		return handicappedAcc;
	}
	
	public int getStars() {
		return stars;
	}
	
	public boolean getGym() {
		return gym;
	}
	
	public boolean getParking() {
		return carParking;
	}
	
	public boolean getSingleBed() {
		return singleBed;
	}
	
	public boolean getDoubleBed() {
		return doubleBed;
	}
	
	public boolean getHotelSuite() {
		return hotelSuite;
	}
	
	public String getSinglePrice() {
		return singlePrice;
	}
	
	public String getDoublePrice() {
		return doublePrice;
	}
	
	public String getSuitePrice() {
		return suitePrice;
	}
	
	public boolean getPets() {
		return petsAllowed;
	}
	
}