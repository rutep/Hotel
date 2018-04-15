package hotelApp;

public class Controller {
	private HotelManager manager = new HotelManager();
	/**
	 * Notkun: controller.search(h)
	 * Fyrir : h er h�tel hlutur sem inniheldur leitar g�gn
	 * @param h
	 * @return Fylki af h�telum sem uppfylla leitarskylir�i
	 */
	public Object[] search(Hotel h) {
		return manager.searchForHotelInDb(h);
	}	
}
