package Roshambo;
import java.util.Scanner;

/**
 * @author ${Christie Desnoyer}
 *
 */

public class RoshamboApp {

	public static void main(String[] args) {
		//Declare/initialize variables
		
		Scanner scan = new Scanner(System.in);
		Player user = new HumanPlayer();
		Player opponent = null;
		int playerWin = 0;
		int compWin = 0;
		int tie = 0;
		String con;
		
		
		RockPaperScissor userValue;
		RockPaperScissor opponentValue;
		
		//prompt user to enter name. Validate input. 
		String userName = Validator.getString(scan, "Please enter your name: ");
		user.setName(userName);
		//Prompt user to select opponent. Validate input.
		String userChoice = Validator.getString(scan, "Would you like to play against the dogs or cats? d/c");
		
		//opponent creator links their choice to player classes and subclasses for the specific subclasses
		//in this case if they choose d, they get the computer opponent that ALWAYS throws rock
		//if they choose c, the get the computer player that throws random Rock Paper Scissor moves
		Player opp2 = OpponentCreator.getPlayer(opponent, userChoice);
		do {
			
		userValue = user.generateRoshambo();
		
		System.out.println(userName +": " + userValue);
		
		opponentValue=opp2.generateRoshambo();
		
		System.out.println("Computer: "+ opponentValue);
		
		
		//Extract this method into a new class and call it. 
		//first compares for a tie
		if (userValue == opponentValue) {
			System.out.println("It's a tie!");
			tie++;
			//Evaluate the conditions where the user wins, 
		} else if (userValue == RockPaperScissor.PAPER && opponentValue == RockPaperScissor.ROCK) {
			System.out.println("You win, " + userName + "!");
			playerWin++;
		} else if (userValue == RockPaperScissor.ROCK &&  opponentValue == RockPaperScissor.SCISSORS) {
			System.out.println("You win, " + userName + "!");
			playerWin++;
		} else if (userValue == RockPaperScissor.SCISSORS && opponentValue == RockPaperScissor.PAPER) {
			System.out.println("You win, " + userName + "!");
			playerWin++;
		} else { //anything else thats not a tie or user win, is by default a computer win.
			System.out.println("Computer Wins!");
			compWin++;
		}
		
	con = Validator.getString(scan, "Would you like to play again? y/n");
	}while(con.equalsIgnoreCase("y"));
	
	//the counters will keep track of player wins, computer wins and ties and print that out at the end.
	System.out.println("You won " + playerWin + " times. The computer won " + compWin + " times. There were " + tie + " ties.");

	}

	

}
