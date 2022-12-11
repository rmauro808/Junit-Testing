

public class Task {

	//identify the strings
	private String taskId;
	private String taskName;
	private String taskDes;
	
	//set up the arguments and exceptions
	public Task(String taskId, String taskName, String taskDes) {
		// if task id is null or longer than 10 characters throw new exception
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Must be valid input!");
		}
		// if task name is null or longer than 20 characters throw new exception
		if (taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Must be valid input!");
		}
		// if task description is null or longer than 50 characters throw new exception
		if (taskDes == null || taskDes.length() > 50) {
			throw new IllegalArgumentException("Must be valid input!");
		}
		
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDes = taskDes;
	
}
	// set up the getters for the test class
	public String getTaskID() {
		return taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDes() {
		return taskDes;
	}
	
	public void setTaskID(String taskId) {
		this.taskId = taskId;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
	
	
}