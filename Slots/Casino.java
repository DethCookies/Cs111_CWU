package Slots;
/**
 * The Casino classes purpose is to hold the main method of the code and run an experiment.
 * 
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 * @author Bentley Bowen
 * 49820909
 * @since 24
 */
public class Casino {
	/**
	 * The main loop of the code. Runs 1000 slot machines and then prints out number of success, failures, and percent success.
	 */
	public static void main(String[] args) 
	{
		/**
		 * user is an array that holds 1000 instances of class SlotMachine.
		 * @see SlotMachine
		 */
		SlotMachine[] user = new SlotMachine[1000];
		for(int i=0; i<1000; i++) 
		{
			SlotMachine game = new SlotMachine();
			user[i] = game;
			if(user[i].isWinner()) 
			{
				SlotMachine.numPlayerWins++;
			}
			else 
			{
				SlotMachine.numHouseWins++;
			}
		}
		System.out.println("You won "+SlotMachine.numPlayerWins+" times!");
		System.out.println("You lost "+SlotMachine.numHouseWins+" times...");
		System.out.println("The chance of you winning is "+(100*(double)SlotMachine.numPlayerWins/(SlotMachine.numPlayerWins+SlotMachine.numHouseWins))+"% of the time!");
		
	}

}
