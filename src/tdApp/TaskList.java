package tdApp;

import java.util.HashMap;

/** This class creates task lists which includes a header for the list. For example cleaning duties. One can contain multiple tasks.
 * In the beginning there is possible to use only one list at the time. Task list holds all its task no matter if they are done or not */

public class TaskList {
	
	private HashMap m_taskList;
	private int m_taskListID = 0;
	private String m_listHeader;
	
	public TaskList (String header) {
		m_listHeader = header;
		m_taskListID += 1;
	}
	
	public void createNewTaskList() {
		HashMap<Integer, TodoTask> m_taskList = new HashMap<>();
	}

	public HashMap getTaskList() {
		return m_taskList;
	}
}
