package assignment5;

import java.util.ArrayList;

public class GameGrid {
	public int len_x;
	public int len_y;
	public ArrayList<GameTileRow> rows;
	public ArrayList<GameTileColumn> cols;
	public GameGrid(int x, int y) {
		this.len_x = x;
		this.len_y = y;
		
		this.rows = new ArrayList<GameTileRow>();
		this.cols = new ArrayList<GameTileColumn>();
		makeGrid();
	}
	private void makeGrid() {
		//make columns
		for(int i = 0; i < this.len_x; i++) {
			cols.add(new GameTileColumn(i));
		}
		//make rows
		for(int j = 0; j < this.len_y; j++) {
			rows.add(new GameTileRow(j));
		}
		//fill with game tiles
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				cols.get(i).addToCol(new GameTile(i,j));
				rows.get(j).addToRow(cols.get(i).getTile(j));
			}
		}
	}
	public void addToken(GameToken token, int x, int y) {
		this.cols.get(x).getTile(y).addToken(token);
		//System.out.println(this.grid[x][y].token.getTokenName());
		
	}
	public GameTileColumn getCol(int i) {
		return cols.get(i);
	}
	public GameTileRow getRow(int i) {
		return rows.get(i);
	}
	public void print() {
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				this.cols.get(i).getTile(j).print();
			}
			System.out.println();
		}
	}
	/**
	public void printGrid() {
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				if(this.grid[i][j].token != null) {
					if(this.grid[i][j].token.getTokenName().equals(Tokens.LASER)) {
						System.out.print(" [L] ");
					}
					else if(this.grid[i][j].token.getTokenName() == Tokens.TARGET_MIRROR) {
						System.out.print(" [TM] ");
					}
					else if(this.grid[i][j].token.getTokenName() == Tokens.CHECK_POINT) {
						System.out.print(" [CP] ");
					}
					else if(this.grid[i][j].token.getTokenName() == Tokens.DOUBLE_MIRROR) {
						System.out.print(" [DM] ");
					}
					else if(this.grid[i][j].token.getTokenName() == Tokens.CELL_BLOCKER) {
						System.out.print(" [B] ");
					}
				}else {
				System.out.print(" [ ] ");
				}
			}
			System.out.println();
		}
	}
	**/

}
