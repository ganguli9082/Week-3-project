import java.util.Arrays;
import java.util.Scanner;


public class ElevatorAlgorithm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//State change of elevator at different floors
		String[] Elevator = {
				"The elevator is already at B",
				"Level 1 button was pushed, Elevator is closed and is going up, Elevator is at level 1, Elevator is open ",
				"Level 2 Button was pushed, Elevator is closed and is going up 2 floors, Elevator is at level 2, Elevator is open"
							};
		//Possible values for elevator at basement
		String[] Basement = {
				"1 was pushed, Elevator is closed, elevator is going up, elevator is at level 1, elevator is open",
				"2 was pushed, Elevator is closed, elevator is going up, elevator is at level 1, elevator is open",
							};
		//Possible values for elevator at Level 1
		String[] Level1 = {
				"0 was pushed,Elevator is closed, elevator is going down, elevator is at level B, elevator is open",
				"Level 2 Button was pushed, Elevator is closed and is going up, Elevator is at level 2, Elevator is open"
						  };
		//Possible values for elevator at level 2
		String[] Level2 = {
				"0 was pushed,Elevator is closed, elevator is going down 2 floors, elevator is at level B, elevator is open",
				"1 was pushed, Elevator is closed, elevator is going down 1 floor, elevator is at level 1, elevator is open",
						  };
		
		
		int index = 0;
		int value = 0;
		Scanner scan= new Scanner(System.in);

		//Declaration of elevator at normal state
		System.out.println("The Elevator is on level 0");
		System.out.println("The Elevator is now open");
		System.out.print("Press a button: ");
		index = scan.nextInt();
		
		while (index>2 || index<0 )
			{
			System.out.print("Invalid button was pushed. Please push another button: ");
			index = scan.nextInt();
			}
		
		System.out.println(Elevator[index]);
		System.out.print("Push button to go to level: ");
		value = scan.nextInt();
		
		while (value>2 || value<0)
		{
			System.out.print("Invalid button was pushed. Please push another button: ");
			value = scan.nextInt();
		}
		if (index == 0)
			{
			System.out.println(Basement[value-1]);
			}
		
		if (index == 1)
			{
			if (value == 0)
				System.out.println(Level1[value]);
			else 
				System.out.println(Level1[value-1]);
			}
		
		else
			System.out.println(Level2[value]);
		
	
				}
	}
		
	
	
