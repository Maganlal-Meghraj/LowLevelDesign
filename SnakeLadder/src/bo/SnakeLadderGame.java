package bo;

import java.util.List;

public class SnakeLadderGame implements Game {
	
	private List<Player> players;
	private Board board;
	private Dice dice;

	@Override
	public void addPlayer() {
		//Logic to get Player Info
		String name = "Name";
		players.add(new Player(dice, board.getBegining().clone(), name));

	}

	@Override
	public void startGame() {
		boolean isFinised = false;
		int turn = 0;
		Player player = null;
		while(!isFinised) {
			player = players.get(turn++);
			isFinised = nextTurn(player);
			turn %= players.size();
		}
		System.out.println("Winner is "+player.toString());

	}
	
	private boolean nextTurn(Player player) {
		int val = player.getTurnValue();
		return setPlayerPosition(player, val);
		
	}
	
	private boolean setPlayerPosition(Player player, int val) {
		Position position = player.getPosition().clone();
		position.setLocation(position.getLocation()+val);
		if(board.isValid(position)) {
			player.setPosition(position);
			if(board.isEnd(position)) {
				return true;
			} else {
				board.move(position);
			}
		}
		return board.isEnd(position);
	}

	@Override
	public void endGame() {
		System.out.println("Kanno Bhege Gelo :(");

	}

	@Override
	public void status() {
		for(Player player : players) {
			System.out.println(player.getName()+" : "+player.getPosition());
		}
	}

}
