package bo;

import java.util.List;

import bo.special.Special;

public interface Board {
	void initialize();

	void addSpecial(Special special);

	void addSpecials(List<Special> specials);

	boolean isEnd(Position position);

	Position getBegining();

	boolean isValid(Position position);

	Position move(Position position);

}
