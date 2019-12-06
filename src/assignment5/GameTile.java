package assignment5;

public class GameTile {
	private int position_x;
	private int position_y;
	public GameToken token = null;
	private Direction beam_in;
	private Direction  beam_out;
	public GameTile(int x, int y) {
		this.position_x = x;
		this.position_y = y;
	}
	public void addToken(GameToken newToken) {
		if(this.token == null) {
			this.token = newToken;
		}else {
			System.out.println("Tile already Occupied");
		}
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
	}
	public void setBeamOut(Direction out) {
		this.beam_out = out;
	}
	public Direction getBeamIn() {
		return this.beam_in;
	}
	public Direction getBeamOut() {
		return this.beam_out;
	}
	
	

}
