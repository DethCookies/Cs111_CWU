package Robotics;
import java.util.Random;
/*
 * The RobotHead class creates a new robot head and assigns a random color to its eyes.
 * 
 * @author Bentley Bowen
 *  49820909
 * @since Java 21
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class RobotHead {
	private String eyeColor = "";
	/*
	 * The constructor of class RobotHead. Gets a random number between 0-5 inclusive then assigns a random color to eyeColor depending on the outcome.
	 */
	public RobotHead() {
		int randomNum = new Random(System.nanoTime()).nextInt(6);
		switch(randomNum) {
		case 0:
			eyeColor = "red";
			break;
		case 1:
			eyeColor = "blue";
			break;
		case 2:
			eyeColor = "purple";
			break;
		case 3:
			eyeColor = "orange";
			break;
		case 4:
			eyeColor = "green";
			break;
		case 5:
			eyeColor = "brown";
		}
			
	}
	/*
	 * The toString method of the RobotHead class. Returns a string with a brief description of eyeColor and the value eyeColor.
	 */
	public String toString() {
		return "Eye color: " + eyeColor;
	}

}
