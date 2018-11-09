import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter rock, paper, or scissors: ");
			String userInput = s.nextLine();
		System.out.println(user(userInput));
		
		System.out.println("Computer chooses: ");
			int cpuInput = r.nextInt(3) + 1;
		System.out.println(cpu(cpuInput));
		
		if ((userInput.equals("rock") && cpuInput == 1) || (userInput.equals("paper") && cpuInput == 2) || (userInput.equals("scissors") && cpuInput == 3)) {
			System.out.println(" ");
			System.out.println("TIE");
		} else if ((userInput.equals("rock") && cpuInput == 2) || (userInput.equals("paper") && cpuInput == 3) || (userInput.equals("scissors") && cpuInput == 1)) {
			System.out.println(" ");
			System.out.println("You LOSE!");
		} else if ((userInput.equals("rock") && cpuInput == 3) || (userInput.equals("paper") && cpuInput == 1) || (userInput.equals("scissors") && cpuInput == 2)) {
			System.out.println(" ");
			System.out.println("You WIN!");
		} 
	}
	public static String user(String input) {
		
		if (input.equals("rock")) {
			return "You chose rock";
		} else if (input.equals("paper")) {
			return "You chose paper";
		} else if (input.equals("scissors")) {
			return "You chose scissors";
		}
		return "oops! Try again";
	}
	public static String cpu(int number) {
	
		if (number == 1) {
			return "rock";
		} else if (number == 2) {
			return "paper";
		} else {
			return "scissors";
		}
	}
}
