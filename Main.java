package yammy.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{

	public static void main(String[] args) {

		DiceRoller[] Roller = new DiceRoller[25];//makes 25 dice rollers

		for(int i = 0; i<Roller.length;i++)
		{
			//create task with array
			Roller[i]= new DiceRoller("Task"+i);	
		}
		
		System.out.println("Starting executor");
		ExecutorService TE = Executors.newCachedThreadPool();
		
		for(int i = 0;i<Roller.length;i++){
			//execute with array
			TE.execute (Roller[i]);
		}	
		TE.shutdown();//closes it
		System.out.println("Task started, main ended.\n");

	}
}
