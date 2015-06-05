import java.util.*;

public class inputTest {
	
	
	public static void main (String[] args) {
		
		// Initialize variables
		String Input = "";		
		
		Scanner in = new Scanner (System.in);
		
		// Print instruction String
		System.out.println("Input the String you wish to reverse");
		
		// User input
		Input = in.nextLine();
		in.close();
		
		System.out.println("You have inputted: " + Input);
		
		// Find length of String and convert to char
		int length = Input.length();
		char []Array = new char[length];
		
		for (int c = 0; c < length ; c++) {
			Array[c] = Input.charAt(c);
		}
		
		// Output Array
		System.out.println("Char output of String");
		
		for (int i = 0; i < length ; i++) {
			System.out.print(Array[i]);
		}
		
		
		
		// Print Reverse Array
		System.out.println("\n\nReversed output is: ");
		
		for (int i = length-1; i >= 0; i--) {
			System.out.print(Array[i]);
		}
		
	}
	
}
