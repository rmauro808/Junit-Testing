import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void testAppointment() {
		Appointment app = new Appointment("1234567890", "2022, 11, 29", "This is going to be the description");
		assertTrue(app.getAppID().equals("1234567890"));
		assertTrue(app.getDateField().equals("2022, 11, 29"));
		assertTrue(app.getAppDes().equals("This is going to be the description"));
	}
	
	@Test
	void testAppIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", "2022, 11, 29", "This is going to be the description");
		}); }
	
	@Test
	void testAppIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, "2022, 11, 29", "This is going to be the description");
		}); }
	
	@Test
	void testAppDateFuture() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", "2022, 11, 22", "This is going to be the description");
		}); }
	
	
	@Test
	void testAppDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", null, "This is going to be the description");
		}); }
	
	@Test
	void testAppDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", "2022, 11, 29", "This is going to be the description and this is going to be the too long version!");
		}); }
	
	@Test
	void testAppDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", "2022, 11, 29", null);
		}); }
	
	

}
