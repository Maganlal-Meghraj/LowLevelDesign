package bo.special;

import bo.Position;

public class Snake implements Special {
	private Position start;
	private Position end;

	public Snake(Position start, Position end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void update(Position position) {
		System.out.println("----- Snake ---------");
		position.setLocation(end.getLocation());
		System.out.println("----- Move to :"+end.getLocation()+" -------");
	}

	@Override
	public boolean isOnSpecial(Position position) {
		return position.equals(start);
	}
}
