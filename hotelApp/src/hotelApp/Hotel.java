package hotelApp;

public class Hotel {
	
	//Instance fields
	private String name;
	private int hotelId;
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
	private double singlePrice;
	private double doublePrice;
	private double suitePrice;
	
	//Constructor ekki kláraður, þarf að spyrja Pétur nánar út í hann
	//Spurningin er hvað nákvæmlega þarf í smiðinn, er það meira en nafn
	public Hotel(String n, int i) {
		this.name = n;
		this.hotelId = i;
	}
	
	// Dev
	public Hotel(String n) {
		this.name = n;
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
	
	public int getHotelId() {
		return hotelId;
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
