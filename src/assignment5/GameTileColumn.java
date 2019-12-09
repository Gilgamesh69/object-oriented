package assignment5;

import java.util.ArrayList;

public class GameTileColumn {
	int columnNum;
	public ArrayList<GameTile> col;
	
	public GameTileColumn(int colN) {
		this.columnNum = colN;
		col = new ArrayList<GameTile>();
	}
	public void addToCol(GameTile g) {
		col.add(g);
	}
	public void removeTile(int i) {
		col.remove(i);
	}
	public GameTile getTile(int i) {
		return col.get(i);
	}

}
