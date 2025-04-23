package Slots;
import java.util.Random;
/**
 * The SlotMachine class creates an instance of a completed slot machine and can determine if the user is a winner.
 * 
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 * @author Bentley Bowen
 * 49820909
 * @since 24
 */
public class SlotMachine {
	/**
	 * A recored number of times that the player wins.
	 * @see Casino
	 */
	static int numPlayerWins = 0;
	/**
	 * A recoded number of times that the house wins/player loses.
	 * @see Casino
	 */
	static int numHouseWins = 0;
	/**
	 * The array that holds an instance of a slot machine for each instance of the class SlotMachine.
	 * @see gambleMachine
	 * @see isWinner
	 */
	int[][] reels = new int[3][3];
	/**
	 * A defined constructor that runs the gambleMachine method on creation of an instance of the class.
	 */
	public SlotMachine() 
	{
		gambleMachine();
	}
	/**
	 * A method that populates the array reels with random numbers.
	 */
	public void gambleMachine()
	{
		for(int i=0; i<9; i++)
		{
			Random random = new Random();
			if(i<3)
			{
				reels[0][i] = random.nextInt(9);
			}
			else if(i<6)
			{
				reels[1][i-3] = random.nextInt(9);
			}
			else
			{
				reels[2][i-6] = random.nextInt(9);
			}
		}
		
	}
	/**
	 * A method that takes the array reels and compares different sections to determine if the player won or not.
	 * It does this by comparing the first value in a "case" to the second and then the third to determine if they are all the same.
	 * <p>
	 * Cases:
	 * Each value in one of the arrays is the same.
	 * The first, second, and third values of the first, second, and third arrays, respectively, are the same. This determines if the user won a diagonal top left to bottom right.
	 * The third, second, and first values of the first, second, and third arrays, respectively, are the same. This determines if the user won a diagonal bottom left to top right.
	 * @return True if one of the cases is true otherwise it returns false
	 */
	public boolean isWinner()
	{
		if(reels[0][0]==reels[0][1]&&reels[0][0]==reels[0][2]) 
		{
			return true;
		}
		else if(reels[1][0]==reels[1][1]&&reels[1][0]==reels[1][2]) 
		{
			return true;
		}
		else if(reels[2][0]==reels[2][1]&&reels[2][0]==reels[2][2]) 
		{
			return true;
		}
		else if(reels[0][0]==reels[1][1]&&reels[0][0]==reels[2][2]) 
		{
			return true;
		}
		else if(reels[0][2]==reels[1][1]&&reels[0][2]==reels[2][0]) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
