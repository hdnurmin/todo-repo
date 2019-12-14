package tdApp;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public TaskList m_taskList;
	
	/**
	 * Run the main tasks of the app
	 */
	public void startApp() {
		
		m_taskList = new TaskList("ToDo List");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Add item to your ToDo list: ");
		TodoTask task = new TodoTask(userInput.nextLine());
		m_taskList.getListOfTasks().add(task);
		
		createTestTaskSet();
		
		printCurrentList();
		
	
	}
	
	/** 
	 * Create tasks to us as a test data.
	 * Add Tasks to tasklist and mark few as done */
	private void createTestTaskSet() {
		
		TodoTask task1 = new TodoTask("Return library books");
		TodoTask task2 = new TodoTask("Buy Christmas presents");
		TodoTask task3 = new TodoTask("Fix bike");
		TodoTask task4 = new TodoTask("Book vet");
		TodoTask task5 = new TodoTask("Plan holiday");
		
		m_taskList.add(task1);
		m_taskList.add(task2);
		m_taskList.add(task3);
		m_taskList.add(task4);
		m_taskList.add(task5);
		
		task5.setTaskDone();
		task3.setTaskDone();
		
	}
	
	/** 
	 * Print Todo list to console.
	 * Separate done and undone tasks to own lists and 
	 * mark done tasks with X
	 */
	private void printCurrentList() {
		System.out.println("ToDo: ");
		for (TodoTask todoTask : m_taskList.getListOfTasks()) {
			if (!todoTask.isTaskDone()) {
				System.out.println(todoTask.getTask());
			}
		}
		System.out.println("");
		System.out.println("Done tasks: ");
		for (TodoTask todoTask : m_taskList.getListOfTasks()) {
			if (todoTask.isTaskDone()) {
				System.out.println(todoTask.getTask());
			}
		}

	}

}
