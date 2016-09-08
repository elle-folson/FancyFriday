import java.util.Scanner;

/**
 * This is a demo app for deciding what to wear.
 */

/**
 * @author Student
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFancyFriday, inputSunny, inputRaining;
		boolean fancyFriday = false; 
		boolean sunny = false; 
		boolean raining = false;
		
		// Get input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Is it Fancy Friday?");
		inputFancyFriday = input.nextLine();
		
		System.out.println("Is it sunny?");
		inputSunny = input.nextLine();
		
		System.out.println("Is it raining?");
		inputRaining = input.nextLine();
		
		
		
		//Set condition variables based on input
		if(inputFancyFriday.equalsIgnoreCase("yes")){
			fancyFriday = true;
		}
		if(inputSunny.equalsIgnoreCase("yes")){
			sunny = true;
		}
		if(inputRaining.equalsIgnoreCase("yes")){
			raining = true;
		}
		//Test if the variables are working properly
				System.out.println(fancyFriday + " " + sunny + " " + raining);
		//Use if statement to decide what to wear

	}

}
