package assignment5;

import java.util.ArrayList;

public class GameGrid {
	public int len_x;
	public int len_y;
	
	public ArrayList<GameTileRow> rows;
	public ArrayList<GameTileColumn> cols;
	private ArrayList<ArrayList<LoadToken>> tokens;
	public Laser laser;
	
	public GameGrid(ArrayList<ArrayList<LoadToken>> tokens) {
		this.len_x = tokens.get(0).size();
		this.len_y = len_x;
		this.tokens = tokens;
		this.rows = new ArrayList<GameTileRow>();
		this.cols = new ArrayList<GameTileColumn>();
		makeGrid();
	}
	/**
	 * Make a grid of tokens
	 */
	private void makeGrid() {
		
		for(int i = 0; i < this.len_x; i++) {
			cols.add(new GameTileColumn(i));
			for(int j = 0; j < this.len_y; j++) {
				cols.get(i).addToCol(decodeLoadToken(tokens.get(i).get(j)));
				//rows.get(j).addToRow(cols.get(i).getTile(j));
			}
		}
	}
	public void addToken(GameToken token, int x, int y) {
		//this.cols.get(x).getTile(y).addToken(token);
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
	private GameToken decodeLoadToken(LoadToken l) {
		GameToken t;
		if(l.getToken() == Tokens.LASER) {
			t = new Laser(l.getOrientation(),l.getX(),l.getY());
			laser = new Laser(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.BEAM_SPLITTER) {
			t = new BeamSplitter(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.CELL_BLOCKER) {
			t = new CellBlocker(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.CHECK_POINT) {
			t = new CheckPoint(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.DOUBLE_MIRROR) {
			t = new DoubleMirror(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.NONE) {
			t = new NoneToken(l.getOrientation(),l.getX(),l.getY());
		}
		else if(l.getToken() == Tokens.TARGET_MIRROR) {
			t = new TargetMirror(l.getOrientation(),l.getX(),l.getY());
		}else {
			t = new NoneToken(l.getOrientation(),l.getX(),l.getY());
		}
		return t;
	}
	public void startLaser() {
		laser.fire(this);
	}

}
