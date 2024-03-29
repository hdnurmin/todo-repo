package tdApp;

/** Todo task is short description of the task to be done. Task knows if it is done or not. */

public class TodoTask {
	
	private String m_taskDeskription;
	private boolean m_doneTask;
	private int m_taskID = 0;
	
	
	public TodoTask (String taskDescription) {
		m_taskDeskription = taskDescription;
		m_doneTask = false;
		m_taskID += m_taskID;
		
	}
	
	public String getTask () {
		return m_taskDeskription;
	}
	
	public boolean isTaskDone() {
		return m_doneTask;
	}
	
	public void setTaskDone() {
		m_doneTask = true;
	}
	
	public void takeTaskBackToList() {
		m_doneTask = false;
	}
	
	public int getTaskID() {
		return m_taskID;
	}

}
