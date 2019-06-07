import java.util.NoSuchElementException;
import java.util.Scanner;

public class ptwelveeighteenMainClass {
	
	
	public static void main(String[] args) {
		
		AirPlane test = new AirPlane();
		FirstClass sub = new FirstClass();
		Economy sub2 = new Economy();
		
		int inputFirstOption = 0;
		int inputFirstClassOrEconomy = 0;
		int inputNumberOfPassengers = 0;
		int inputAisleCenterOrWindowSeat = 0;
		
		boolean loop = false;
		
		while(!loop) {
			
			try {
				Scanner in = new Scanner(System.in);	
				
				System.out.println("Would you like to : 	Add Passengers (press 1) , Show Seating(press 2)"
						+ ", Quit (press 3");
				inputFirstOption = in.nextInt();
				
				if(1 == inputFirstOption) {
					System.out.println("Would you like to fly First Class (press 1) or Economy(press 2) ?");			
					inputFirstClassOrEconomy = in.nextInt();
					
					System.out.println("How many passengers are in your party?");			
					inputNumberOfPassengers = in.nextInt();
					
					if(1 == inputFirstClassOrEconomy) {
						if(1 == inputNumberOfPassengers) {
							System.out.println("What is your seating preference?");								
							System.out.println("Would you like an aisle seat (press 1) or a window seat(press 2) ?");	
							inputAisleCenterOrWindowSeat = in.nextInt();
						}						
						
						if(!sub.checkAvailablity(inputNumberOfPassengers, inputAisleCenterOrWindowSeat)) {
							System.out.println("Arrangement not available.");
						}
						test.toString();
					}
					else if(2 == inputFirstClassOrEconomy) {
						if(1 == inputNumberOfPassengers) {
							System.out.println("What is your seating preference?");
							System.out.println("Would you like an aisle seat (press 1), a window seat(press 2) "
									+ "or center seat(press 3) ?");	
							inputAisleCenterOrWindowSeat = in.nextInt();
						}			
					
						if(!sub2 .checkAvailablity(inputNumberOfPassengers, inputAisleCenterOrWindowSeat)) {
							System.out.println("Arrangement not available.");
						}
						test.toString();
					}   
				}
				
				else if(2 == inputFirstOption) {
					System.out.println(test.toString());
					
				}
				
				else if(3 == inputFirstOption) {
					loop = true;
				}
				
				
			}
			catch(NoSuchElementException exception) {
				System.out.println("NoSuchElementException");
				loop = true;
			}			
		}		
		
	}
}
