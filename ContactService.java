import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> Contacts;
	
	public ContactService() {
		Contacts = new ArrayList<>();
	}
	
	// Add a contact
	public boolean addContact(Contact c) {
		boolean contactExist = false;
		// check to see if the contact is already in the list
		for (Contact list:Contacts) {
			if(list.equals(c)) {
				contactExist = true;
			}
		}
		//if the contact does not already exist in the list then add it.
		if(!contactExist) {
			Contacts.add(c);
			return true;
		}
		// if the contact is already there then return false.
		else {
			return false;
		}
	}
	
	//Delete a contact
	public boolean deleteContact(String contactID) {
		//looping to see if contact already exist
		for(Contact list:Contacts) {
			//if contact does exist then delete it
			if(list.getContactID().equals(contactID)) {
				Contacts.remove(list);
				return true;
			}
		}
		// if there is no contact then returns false.
		return false;
	}
	
	
	//updating contacts
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		
		for (Contact list:Contacts) {
			if (list.getContactID().equals(contactID)) {
				//this will check the first name and make sure it is correct and if it is then it will add to the list
				if(!firstName.equals("") && !(firstName.length()>10)) {
					list.setFirstName(firstName);
				}
				//this will check the last name and make sure it is correct and if it is then it will add to the list
				if(!lastName.equals("") && !(lastName.length()>10)) {
					list.setLastName(lastName);
				}
				//this will check the phone number and make sure that it is correct and if it is then it will add to the list
				if(!phoneNumber.equals("") && !(phoneNumber.length()>10) && !(phoneNumber.length()<10)) {
					list.setPhoneNumber(phoneNumber);
				}
				//this will check the address and make sure that it is correct and if it is then it will add to the list 
				if(!address.equals("") && !(address.length()>30)) {
					list.setAddress(address);
				}
				
				return true;
			}
		}
		
		return false;
	}
}