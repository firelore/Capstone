import org.junit.*;
import java.util.*;
import play.test.*;
import models.concerts.*;

public class ConcertsTest extends UnitTest {
	Band megadeth;
	Event rockopalypse;
	Venue excel;

	@Before
	public void setup() {
		Fixtures.deleteDatabase();

		megadeth = new Band("Megadeth").save();
		rockopalypse = new Event("Rockopalypse", new Date(1333326600)).save();
		excel = new Venue("Excel Energy Center", "123 Street", 
						"St. Paul", "MN", "12345", "612-555-5555").save();
	}

	@Test
	public void testBandInfo() {
		Band band = Band.find("byBandName", "Megadeth").first();

		assertNotNull(band);
		assertEquals("Megadeth", band.bandName);
	}

	@Test
	public void testVenueInfo() {
		Venue venue = Venue.find("byHallName", "Excel Energy Center").first();

		assertNotNull(venue);
		assertEquals("Excel Energy Center", venue.hallName);
		assertEquals("123 Street", venue.address1);
		assertEquals("St. Paul", venue.city);
		assertEquals("MN", venue.state);
		assertEquals("12345", venue.zipCode);
		assertEquals("612-555-5555", venue.phoneNumber);
	}

	@Test
	public void testEventInfo() {
		Event event = Event.find("byEventName", "Rockopalypse").first();

		assertNotNull(event);
		assertEquals("Rockopalypse", event.eventName);
		assertEquals(new Date(1333326600), event.eventDate);
	}
}