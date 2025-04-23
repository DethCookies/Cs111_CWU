package Robotics;
/*
 * The RobotGarage class holds the main loop of the program.
 * @author Bentley Bowen
 *  49820909
 * @since Java 21
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class RobotGarage {
	/*
	 * The main method of class RobotGarage. Creates a array of robots of size 3 where it fills the first two with individual robots and the third with
	 * a copy of the first robot. It then prints out the values of each robots toString method. Finally, it uses the equals method to check to see if any
	 * of the robots have the same ID printing out "the (robot) and (robot2) are the same" if it finds one.
	 * @see Robot.toString()
	 */
	public static void main(String[] args) {
		Robot[] arrayOfBots = new Robot[3];
		arrayOfBots[0] = new Robot();
		arrayOfBots[1] = new Robot();
		arrayOfBots[2] = arrayOfBots[0].copy(); 
		System.out.println(arrayOfBots[0].toString());
		System.out.println(arrayOfBots[1].toString());
		System.out.println(arrayOfBots[2].toString());
		System.out.println(Robot.getRobotCount());
		if(arrayOfBots[0].equals(arrayOfBots[1])) {
			System.out.println("The first and second robots are the same.");
		}
		if(arrayOfBots[0].equals(arrayOfBots[2])) {
			System.out.println("The first and third robots are the same.");
		}
		if(arrayOfBots[1].equals(arrayOfBots[2])) {
			System.out.println("The second and third robots are the same.");
		}
	}

}
