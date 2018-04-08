package hotelApp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class hotelFrameTest {
	static Object[] leit;
	static HotelManager manager = new HotelManager();
	static Controller con = new Controller();

	// @ Before
	public void setUp() {
		leit = new Object[]{"Hilton"};	
	}
	
	// @ After
	public void tearDown() {
		leit = null;
	}
	
	// @ Test
	public void testSearch() {
		Object[] res = con.search(leit);
		assertEquals("Hilton", ((Hotel) ((Object) res[0])).getName());
	}
	
}