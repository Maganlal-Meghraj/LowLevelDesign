package bo;

import java.util.Random;

public class Dice {
	
	private final Random random;

	public Dice(Random random) {
		this.random = random;
	}
	
	public int rollDice() {
		return this.random.nextInt(6)+1;
	}
}
