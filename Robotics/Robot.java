package Robotics;
import java.util.Random;
/*
 * The Robot class creates a new Robot with a head, torso, and random serialID. It also holds the number of instances of class Robot.
 * 
 * @author Bentley Bowen
 *  49820909
 * @since Java 21
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class Robot {
	private static int numRobots = 0;
	private RobotHead robotHead;
	private RobotTorso robotTorso;
	private String serialID = "";
	/*
	 * The constructor of class Robot. Creates a new instances of both classes robotHead and robotTorso, 
	 * as well as creating a serialID with a random variable from 0 to 100000 inclusive. Finally, it increments the value numRobots.
	 */
	public Robot() {
		numRobots++;
		robotHead = new RobotHead();
		robotTorso = new RobotTorso();
		serialID = "ArmyRobot"+ new Random((System.nanoTime())).nextInt(100001);
	}
	/*
	 * A setter method for the value SerialID.
	 */
	public void setSerialID(String serial) {
		serialID = serial;
	}
	/*
	 * A getter method for the value SerialID.
	 */
	public String getSerialID() {
		return serialID;
	}
	/*
	 * A static getter method for the static value numRobots.
	 */
	public static int getRobotCount() {
		return numRobots;
	}
	/*
	 * The toString method of class Robot. Returns a string with a brief description of serialID and each toString of robotHead and robotTorso.
	 * @see RobotHead.toString()
	 * @see RobotTorso.toString()
	 */
	public String toString() {
		String str = "Serial ID: "+serialID+", "+robotHead.toString()+", "+robotTorso.toString();
		return str;
	}
	/*
	 * The equals method of class Robot. Checks to see if the inputed instance of Robot has the same serialID and if it does it returns true, otherwise false.
	 */
	public boolean equals(Robot aRobot) {
		if(serialID == aRobot.serialID) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * The copy method of class Robot. Creates a new instance of class Robot then sets its ID to the current instances ID. Finally, it returns said new instance.
	 */
	public Robot copy() {
		Robot robotCopy = new Robot();
		robotCopy.setSerialID(serialID);
		return robotCopy;
	}
}
