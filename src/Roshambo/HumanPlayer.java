package Roshambo;
import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner scan;

	@Override
	public RockPaperScissor generateRoshambo() {
		scan = new Scanner(System.in);
		//created my own validator in the validator class 
		//to assign the user input to the enum values
		String userInput = Validator.getRSP(scan, "Rock, Paper, Scissors (R/P/S)");
		if (userInput.equalsIgnoreCase("r")) {
			return RockPaperScissor.ROCK;
		} else if (userInput.equalsIgnoreCase("p")) {
			return RockPaperScissor.PAPER;
		} else if (userInput.equalsIgnoreCase("s")) {
			return RockPaperScissor.SCISSORS;
		} else {
			return null;
		}
	}

}
