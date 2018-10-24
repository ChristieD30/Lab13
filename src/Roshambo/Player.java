package Roshambo;

public abstract class Player {
	private String name;
	private RockPaperScissor value;

	
	
	public abstract RockPaperScissor generateRoshambo();
	
	public Player() {
		
	}
	
	public Player(String name, RockPaperScissor value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public RockPaperScissor getValue() {
		return value;
	}
	
	public void setValue(RockPaperScissor value) {
		this.value = value;
	}

	
	

}
