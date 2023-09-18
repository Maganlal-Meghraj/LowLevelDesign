package bo;

import java.util.Objects;

public class Position implements Comparable<Position> {
	
	private int location;
	
	public Position(int location) {
		super();
		this.location = location;
	}

	

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	private Position(Position position) {
		this.location = position.location;
	}
	
	public Position clone() {
		return new Position(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return location == other.location;
	}



	@Override
	public int compareTo(Position position) {
		return this.location - position.getLocation();
	}
	
}
