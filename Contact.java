public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("First Name Too Long!");
		}
		
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Last Name too Long!");
		}
		
		if(phoneNumber == null || phoneNumber.length()>10 || phoneNumber.length()<10) {
			throw new IllegalArgumentException("Phone number must be 10 digits!");
		}
		
		if(address == null || address.length()>30 ) {
			throw new IllegalArgumentException("Address must contain 30 characters!");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// getter , setters for all

	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
