package Robotics;
import java.util.Random;
/*
 * The RobotTorso class creates a new robot torso and assigns a number of arms to it at random.
 * 
 * @author Bentley Bowen
 *  49820909
 * @since Java 21
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class RobotTorso {
	private int numArms = 0;
	
	/*
	 * The constructor of class RobotTorso. Assigns a number of arms to value numArms between the numbers 0-10 inclusive.
	 */
	public RobotTorso() {
		numArms = new Random().nextInt(11);
	}
	/*
	 * The toString method of class RobotTorso. Returns a string with a short explanation of what is being returned and the value numArms.
	 */
	public String toString() {
		return "Number of arms: " + numArms;
	}
}
