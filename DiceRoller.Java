package yammy.main;

import java.util.Random;

public class DiceRoller implements Runnable {

	private final int sleepTime;
	private final String taskName;
	private final static Random random = new Random();

	public DiceRoller(String name)
	{
		taskName = name; 
		sleepTime = random.nextInt(5000);
		System.out.println(taskName);
		
	}

	public void run() {		
		Runnable T1 = new MyThread(taskName);
		Thread worker = new Thread(T1);
		worker.setName(taskName);
		worker.start();
	}

}
