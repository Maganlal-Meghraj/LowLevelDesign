package bo.special;

import bo.Position;

public class Ladder implements Special {
	private Position start;
	private Position end;

	public Ladder(Position start, Position end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void update(Position position) {
		System.out.println("----- Ladder ---------");
		position.setLocation(end.getLocation());
		System.out.println("----- Move to :"+end.getLocation()+" -------");
	}

	@Override
	public boolean isOnSpecial(Position position) {
		return position.equals(start);
	}

}
