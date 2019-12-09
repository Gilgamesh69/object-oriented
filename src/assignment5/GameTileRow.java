package assignment5;

import java.util.ArrayList;

public class GameTileRow {
	
	int rowNum;
	public ArrayList<GameTile> row;
	
	public GameTileRow(int rowN) {
		this.rowNum = rowN;
		row = new ArrayList<GameTile>();
	}
	public void addToRow(GameTile g) {
		row.add(g);
	}
	public void removeTile(int i) {
		row.remove(i);
	}
	public GameTile getTile(int i) {
		return row.get(i);
	}

}
