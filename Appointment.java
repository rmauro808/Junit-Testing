import java.util.Date;

public class Appointment {
	String appID;
	String dateField;
	String appDes;
	
	Date dt1 = new Date(2022, 11, 23);
	
	Date dt2 = new Date(2022, 11, 25);
	
	
	public Appointment(String appID, String dateField, String appDes) {
		if(appID == null || appID.length() > 10) {
			throw new IllegalArgumentException("Invalid Appointment ID!");
		}
		
		if(dateField == null || dt2.before(dt1)) {
			throw new IllegalArgumentException("Invalid Date, Must be in future!");
		}
		
		if(appDes == null || appDes.length() > 50) {
			throw new IllegalArgumentException("Invalid Description, too long!");
		}
		
		this.appID = appID;
		this.dateField = dateField;
		this.appDes = appDes;
	}
	
	//getter, setters
	
	public String getAppID() {
		return appID;
	}
	public void setAppID() {
		this.appID = appID;
	}
	public String getDateField() {
		return dateField;
	}
	public void setDateField() {
		this.dateField = dateField;
	}
	public String getAppDes() {
		return appDes;
	}
	public void setAppDes() {
		this.appDes = appDes;
	}
	
	
}
