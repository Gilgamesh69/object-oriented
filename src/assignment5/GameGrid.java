package assignment5;

public class GameGrid {
	private int len_x;
	private int len_y;
	private GameTile grid[][];
	
	public GameGrid(int x, int y) {
		this.len_x = x;
		this.len_y = y;
		this.grid = new GameTile[x][y];
		makeGrid();
	}
	private void makeGrid() {
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				this.grid[i][j] = new GameTile(i,j);
			}
		}
	}
	public void addToken(GameToken token, int x, int y) {
		this.grid[x][y].addToken(token);
		//System.out.println(this.grid[x][y].token.getTokenName());
		
	}
	public void print() {
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				if(this.grid[i][j].token != null)
					System.out.println(this.grid[i][j].token.getTokenName());
			}
		}
	}
	public void printGrid() {
		for(int i = 0; i < this.len_x; i++) {
			for(int j = 0; j < this.len_y; j++) {
				System.out.println(grid[i][j].token.getTokenName());
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
				}else {
					System.out.print(" [ ] ");
				}
			}
			System.out.println();
		}
	}

}
