package hotelApp;

public class hotel {
	
	//Instance fields
	private String name;
	private int ssn;
	private String address;
	private String town;
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
	private double singlePrice;
	private double doublePrice;
	private double suitePrice;
	
	//Constructor ekki kláraður, þarf að spyrja Pétur nánar út í hann
	//Spurningin er hvort öll instance fara í smið eða ekki?
	public hotel(String n, int i) {
		name = n;
		ssn = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setSsn(int s) {
		ssn = s;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setTown(String t) {
		town = t;
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
	
	public void setSinglePrice(double s) {
		singlePrice = s;
	}
	
	public void setDoublePrice(double d) {
		doublePrice = d;
	}
	
	public void setSuitePrice(double p) {
		suitePrice = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTown() {
		return town;
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
	
	public double getSinglePrice() {
		return singlePrice;
	}
	
	public double getDoublePrice() {
		return doublePrice;
	}
	
	public double getSuitePrice() {
		return suitePrice;
	}
	
}