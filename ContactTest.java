
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234567891", "First Name", "Last Name1", "1234567891", "1234 junipter ln");
		assertTrue(contact.getContactID().equals("1234567891"));
		assertTrue(contact.getfirstName().equals("First Name"));
		assertTrue(contact.getLastName().equals("Last Name1"));
		assertTrue(contact.getPhoneNumber().equals("1234567891"));
		assertTrue(contact.getAddress().equals("1234 junipter ln"));
	}

	
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12324526789", "First Name", "Last Name1", "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "First Name", "Last Name1", "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First3 Name", "Last Name1", "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", null, "Last Name1", "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last22 Name1", "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", null, "1234567891", "1234 junipter ln");
		});	}
	
	@Test
	void testPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last Name1", "123453467891", "1234 junipter ln");
		});	}
	
	@Test
	void testPhoneNumberToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last Name1", "123891", "1234 junipter ln");
		});	}
	
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last Name1", null, "1234 junipter ln");
		});	}
	
	@Test
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last Name1", "1234567891", "1233444444444444444 junipter ln");
		});	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345267891", "First Name", "Last Name1", "1234567891", null);
		});	}

}
