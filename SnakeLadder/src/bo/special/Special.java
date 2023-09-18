package bo.special;

import bo.Position;

public interface Special {
	void update(Position position);
	boolean isOnSpecial(Position player);
}
