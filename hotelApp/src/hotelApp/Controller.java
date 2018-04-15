package hotelApp;

public class Controller {
	private HotelManager manager = new HotelManager();
	/**
	 * Notkun: controller.search(h)
	 * Fyrir : h er hótel hlutur sem inniheldur leitar gögn
	 * @param h
	 * @return Fylki af hótelum sem uppfylla leitarskylirði
	 */
	public Object[] search(Hotel h) {
		return manager.searchForHotelInDb(h);
	}	
}
