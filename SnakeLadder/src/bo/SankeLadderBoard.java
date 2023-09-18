package bo;

import java.util.ArrayList;
import java.util.List;

import bo.special.Special;

public class SankeLadderBoard implements Board {
	private Position start;
	private Position end;
	private List<Special> specials;
	
	public Position getStart() {
		return start;
	}
	public void setStart(Position start) {
		this.start = start;
	}
	public Position getEnd() {
		return end;
	}
	public void setEnd(Position end) {
		this.end = end;
	}
	
	
	@Override
	public void initialize() {
		this.start = new Position(1);
		this.end = new Position(100);
	}
	@Override
	public void addSpecial(Special special) {
		if(this.specials == null) this.specials = new ArrayList<>();
		this.specials.add(special);
		
	}
	@Override
	public void addSpecials(List<Special> specials) {
		if(this.specials == null) this.specials = specials;
		else this.specials.addAll(specials);
		
	}
	@Override
	public boolean isEnd(Position position) {
		return this.end.equals(position);
	}
	@Override
	public Position getBegining() {
		return this.start;
	}
	@Override
	public boolean isValid(Position position) {
		return end.compareTo(position) >= 0;
	}
	@Override
	public Position move(Position position) {
		for(Special special : specials) {
			if(special.isOnSpecial(position)) {
				special.update(position);
				break;
			}
		}
		return position;
		
	}
}
