package hotelApp;

public class DbManager {
	public String makeSearchQuery(String s){
		return "select name from hotel where name = " + s;
		}
		public Object[] runQuery(String s) {
		return new Object[] {"Hilton"};
		}
}
