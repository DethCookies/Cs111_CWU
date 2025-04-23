package Fixer;
import java.io.*;
import java.util.Scanner;
/* 
 * The document Fixer class takes the document Employees.txt and reformats it to the requested formating and modifications to salary.
 * 
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 * @author Bentley Bowen
 * 49820909
 * @since 24
*/
public class DocumentFixer {
	/*
	 * The main method. This runs the method fixDocument.
	 * @see fixDocument
	 */
	public static void main(String[] args) throws IOException 
	{
		fixDocument("C:\\Users\\bentl\\eclipse-workspace\\DocumentFixer\\src\\Fixer/Employees.txt");

	}
	/*
	 * fixDocument is a method that takes the document Employees and puts each section of it into 
	 * the array tokens to separate the values and then each of these values are further separated
	 * into each array called emplyeeNames, emplyeeIDs, and emplyeeSalaries.
	 * When it is adding to emplyeeSalaries it also adds a 3% raise. Finally fixDocument makes a file
	 * called "EmployeesUpdatedSalaries.txt" and adds the information in the requested order.
	 */
	public static void fixDocument(String fileName) throws IOException
	{
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		String[] emplyeeNames = new String[483];
		String[] emplyeeIDs = new String[483];
		int[] emplyeeSalaries = new int[483];
		double salary = 0;
		for(int i = 0; i<483; i++)
		{
			String[] tokens = scan.nextLine().split(",");
			emplyeeNames[i] = tokens[0];
			emplyeeIDs[i] = tokens[1];
			salary = Integer.parseInt(tokens[2].substring(1))*1.03;
			emplyeeSalaries[i] = (int)salary;
		}
		scan.close();
		File newEmployeeFile = new File("EmployeesUpdatedSalaries.txt");
		newEmployeeFile.createNewFile();
		PrintWriter filePrinter = new PrintWriter(""+"EmployeesUpdatedSalaries.txt");
		for(int i = 0; i<483; i++) 
		{
			filePrinter.write(emplyeeNames[i]+",$"+emplyeeSalaries[i]+","+emplyeeIDs[i]+"\n");
		}
		filePrinter.close();
	}

}
