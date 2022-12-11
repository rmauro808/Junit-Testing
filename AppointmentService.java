import java.util.ArrayList;

public class AppointmentService {
	private ArrayList<Appointment> Appointment;
	
	public AppointmentService() {
		Appointment = new ArrayList<>();
		
	}
	
	// add appointment
	public boolean addAppointment(Appointment a) {
		boolean appointmentExist = false;
		for (Appointment list:Appointment) {
			if (list.equals(a)) {
				appointmentExist = true;
			}
		}
		//if the appointment does not exist add it
		if(!appointmentExist) {
			Appointment.add(a);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteAppointment(String appID) {
		//loop through to see if the contact already exist
		for(Appointment list:Appointment) {
			
			if(list.getAppID().equals(appID)) {
				Appointment.remove(list);
				return true;
			}
		}
		
		return false;
	}
	
}
