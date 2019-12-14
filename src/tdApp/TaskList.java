package tdApp;

import java.util.ArrayList;

/** This class creates task lists which includes a header for the list. For example cleaning duties. One can contain multiple tasks.
 * In the beginning there is possible to use only one list at the time. Task list holds all its task no matter if they are done or not */

public class TaskList {
	
	private ArrayList<TodoTask> m_listOfTasks;
	private int m_taskListID = 0;
	private String m_listHeader;
	
	public TaskList (String header) {
		m_listHeader = header;
		m_taskListID += 1;
		createNewTaskList();
	}
	
	public void createNewTaskList() {
		m_listOfTasks = new ArrayList<>();
	}

	public ArrayList<TodoTask> getListOfTasks() {
		return m_listOfTasks;
	}
	

	public void add(TodoTask task) {
		m_listOfTasks.add(task);		
	}
	
	public String getListHeader() {
		return m_listHeader;
	}
}
