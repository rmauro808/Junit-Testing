import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234567891", "First Name", "Last Name1", "1234567891", "1234 junipter ln");
		assertTrue(contact.getContactID().equals("1234567891"));
		assertTrue(contact.getfirstName().equals("First Name"));
		assertTrue(contact.getLastName().equals("Last Name1"));
		assertTrue(contact.getPhoneNumber().equals("1234567891"));
		assertTrue(contact.getAddress().equals("1234 junipter ln"));
	}
	
	
	//Test the add contact feature
	@Test
	public void testAddContact() {
		ContactService contactService = new ContactService();
		Contact testAdd = new Contact("1234567891", "First Name", "Last Name1", "1234567891", "1234 junipter ln");
		assertEquals(true, contactService.addContact(testAdd));
	}
	
	//Test the delete contact feature
	@Test
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
		assertEquals(false, contactService.deleteContact("1234567891"));
	}
	
	//test update contact feature
	@Test
	public void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact c1 = new Contact("1234567891", "Brian", "Quinn", "5677788523", "123 impractical ln NJ 95432");
		
		contactService.addContact(c1);
		assertEquals(false, contactService.updateContact("1231231231", "James", "Murray", "7899874563", "123 Jokers ln NJ 98543"));
	}

}
