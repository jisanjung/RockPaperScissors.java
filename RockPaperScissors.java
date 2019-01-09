import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		int win = 0;
		int lost = 0;
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i > 0; i++) {
			System.out.println("Enter rock, paper, scissors, or stats to see scoreboard: ");
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
				++lost;
			} else if ((userInput.equals("rock") && cpuInput == 3) || (userInput.equals("paper") && cpuInput == 1) || (userInput.equals("scissors") && cpuInput == 2)) {
				System.out.println(" ");
				System.out.println("You WIN!");
				++win;
			} else if (userInput.equals("quit")) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			fileCreator(win, lost);
			
			if (userInput.equals("stats")) {
				System.out.println("\n" + "****SCOREBOARD****");
				showStats();
				System.exit(0);
			}
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
	public static void fileCreator(int wins, int loss) {
		try {
			FileWriter fw = new FileWriter("stats.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Wins: " + wins);
			pw.println("Losses: " + loss);
			
			pw.close();
		} catch (IOException e) {
			System.out.println("error");
		}
	}
	public static void showStats() {
		try {
			FileReader fr = new FileReader("stats.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str + "\n");
			}
			br.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
