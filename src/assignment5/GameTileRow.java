package assignment5;

import java.util.ArrayList;

public class GameTileRow {
	
	int rowNum;
	public ArrayList<GameToken> row;
	
	public GameTileRow(int rowN) {
		this.rowNum = rowN;
		row = new ArrayList<GameToken>();
	}
	public void addToRow(GameToken g) {
		row.add(g);
	}
	public void removeTile(int i) {
		row.remove(i);
	}
	public GameToken getTile(int i) {
		return row.get(i);
	}

}
