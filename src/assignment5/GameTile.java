package assignment5;

public class GameTile {
	private int position_x;
	private int position_y;
	public GameToken token = null;
	private Direction beam_in = Direction.BLOCKED;
	private Direction  beam_out = Direction.BLOCKED;
	public GameTile(int x, int y) {
		this.position_x = x;
		this.position_y = y;
		NoneToken nil = new NoneToken(Direction.NORTH);
		addToken(nil);
	}
	public void addToken(GameToken newToken) {
		this.token = newToken;
		this.beam_out = this.token.getDirectionOut();
	}
	public void removeToken() {
		this.token = null;
	}
	public int getX() {
		return this.position_x;
	}
	public int getY() {
		return this.position_y;
	}
	public void setBeamIn(Direction in) {
		this.beam_in = in;
		this.token.setBeamIn(in);
		this.token.sendBeamOut();
		this.beam_out = this.token.getDirectionOut();
	}
	public void setBeamOut(Direction out) {
		this.token.sendBeamOut();
		this.beam_out = this.token.getDirectionOut();
	}
	public Direction getBeamIn() {
		return this.beam_in;
	}
	public Direction getBeamOut() {
		return this.beam_out;
	}
	public void print() {
		String cell = "[";
		if(this.beam_out != Direction.BLOCKED) {
			if(this.beam_out == Direction.EAST || this.beam_out == Direction.WEST) {
				cell = cell.concat("--");
			}
			else if(this.beam_out == Direction.NORTH || this.beam_out == Direction.SOUTH) {
				cell = cell.concat("|");
			}
		}
			
		if(this.token != null) {
			if(this.token.getTokenName().equals(Tokens.LASER)) {
				cell = cell.concat("L");
			}
			else if(this.token.getTokenName() == Tokens.TARGET_MIRROR) {
				cell = cell.concat("TM");
			}
			else if(this.token.getTokenName() == Tokens.CHECK_POINT) {
				cell = cell.concat("CP");
			}
			else if(this.token.getTokenName() == Tokens.DOUBLE_MIRROR) {
				cell = cell.concat("DM");
			}
			else if(this.token.getTokenName() == Tokens.CELL_BLOCKER) {
				cell = cell.concat("B");
			}
			else if(this.token.getTokenName() == Tokens.NONE) {
				cell = cell.concat(" ");
			}
			else {
				cell = cell.concat(" ");
			}
		}
		cell = cell.concat("]");
		System.out.print(cell);
	}
	
	

}
