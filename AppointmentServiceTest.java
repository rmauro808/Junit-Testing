import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	@Test
	void testContact() {
		Appointment appointment = new Appointment("1234567890", "2022, 11, 29", "This is going to be the description");
		assertTrue(appointment.getAppID().equals("1234567890"));
		assertTrue(appointment.getDateField().equals("2022, 11, 29"));
		assertTrue(appointment.getAppDes().equals("This is going to be the description"));
	}
	
	@Test
	public void testAppIdToLong() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment testAdd = new Appointment("1234567890", "2022, 11, 29", "This is going to be the description");
		assertEquals(true, appointmentService.addAppointment(testAdd));
	}
	
	@Test
	public void testAppIdNull() {
		AppointmentService appointmentService = new AppointmentService();
		assertEquals(false, appointmentService.deleteAppointment("1234567890"));
	}
	

}
