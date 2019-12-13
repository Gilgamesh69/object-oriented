package assignment5;

import java.util.ArrayList;

public class GameTileColumn {
	int columnNum;
	public ArrayList<GameToken> col;
	
	public GameTileColumn(int colN) {
		this.columnNum = colN;
		col = new ArrayList<GameToken>();
	}
	public void addToCol(GameToken g) {
		col.add(g);
	}
	public void removeTile(int i) {
		col.remove(i);
	}
	public GameToken getTile(int i) {
		return col.get(i);
	}

}
