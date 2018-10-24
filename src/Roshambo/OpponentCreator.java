package Roshambo;


public class OpponentCreator{

	public static Player getPlayer(Player p1, String choice) {
		if (choice.equalsIgnoreCase("d")) {
			p1= new Rocker();
			Rocker comp = (Rocker) p1;
			comp.generateRoshambo();
			

		} else if(choice.equalsIgnoreCase("c")) {
			p1= new ComputerPlayer();
			ComputerPlayer comp = (ComputerPlayer) p1;
			comp.generateRoshambo();

		} 

		return p1;
	}

	
	

	
}

	
