package Roshambo;

public class ComputerPlayer extends Player{

	@Override
	public RockPaperScissor generateRoshambo() {
		
		int randNum = (int) (Math.random() * 3);
	     
		switch(randNum) {
		case 0: 
			return RockPaperScissor.ROCK;
		case 1:
			return RockPaperScissor.PAPER;
		case 2:
			return RockPaperScissor.SCISSORS;
		default :
				return RockPaperScissor.PAPER;
		
		}
		
		
	}

}
