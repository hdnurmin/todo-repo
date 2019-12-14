package tdApp;

import java.util.Scanner;

public class App {
	
	private Scanner m_userInput;
	public TaskList m_taskList = new TaskList("ToDo List");
	
	public void startApp() {
		
		m_userInput = new Scanner(System.in);
		System.out.println("Add item to your ToDo list: ");
		
		
	}

}
