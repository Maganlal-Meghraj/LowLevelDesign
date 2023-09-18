package bo;



public class Player {
	private Dice dice;
	private Position position;
	private String name;
	
	
	public Player(Dice dice, Position position, String name) {
		super();
		this.dice = dice;
		this.position = position;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public int getTurnValue() {
		return this.dice.rollDice();
	}
	
	
	
	
}
