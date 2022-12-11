import java.util.*;


public class TaskService {

	//create a task array
private ArrayList<Task> Tasks;
	
	public TaskService() {
		Tasks = new ArrayList<>();
	}
	
	// Add a task
	public boolean addTask(Task t) {
		boolean taskExist = false;
		// check to see if the task is already in the list
		for (Task list:Tasks) {
			if(list.equals(t)) {
				taskExist = true;
			}
		}
		//if the task does not already exist in the list then add it.
		if(!taskExist) {
			Tasks.add(t);
			return true;
		}
		// if the task is already there then return false.
		else {
			return false;
		}
	}
	
	
	//Delete a task
		public boolean deleteTask(String taskId) {
			//looping to see if task already exist
			for(Task list:Tasks) {
				//if task does exist then delete it
				if(list.getTaskID().equals(taskId)) {
					Tasks.remove(list);
					return true;
				}
			}
			// if there is no task then returns false.
			return false;
		}
	
		
		//updating tasks
		public boolean updateTask(String taskId, String taskName, String taskDes) {
			
			for (Task list:Tasks) {
				if (list.getTaskID().equals(taskId)) {
					//this will check the task id and make sure it is correct and if it is then it will add to the list
					if(!taskId.equals("") && !(taskId.length()>10)) {
						list.setTaskID(taskId);
					}
					//this will check the task name and make sure it is correct and if it is then it will add to the list
					if(!taskName.equals("") && !(taskName.length()>20)) {
						list.setTaskName(taskName);
					}
					//this will check the task description and make sure that it is correct and if it is then it will add to the list
					if(!taskDes.equals("") && !(taskDes.length()>50)) {
						list.setTaskDes(taskDes);
					}
					
					return true;
				}
			}
			
			return false;
		}
		
}
