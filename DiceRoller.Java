package yammy.main;

public class DiceRoller implements Runnable {

	private final String taskName;//so you cant change the name

	public DiceRoller(String name)
	{
		taskName = name; //sets taskName
	}

	public void run() {		
		//try catch
		try{
			System.out.printf("%s Starto\n",taskName);
			Runnable T1 = new MyThread(taskName);//make new thread 
			Thread worker = new Thread(T1);
			worker.setName(taskName);//set name
			worker.start();//starto
		}
		catch(Exception e)
		{
			System.out.printf("%s %s\n",taskName,"terminated prematurely due to interruption");
		}
		//when its done
		System.out.printf("%s done Throwing\n",taskName);
	}

}
