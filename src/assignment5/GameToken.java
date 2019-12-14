package assignment5;
/**
 * GAME TOKEN - SIDEs
 * 	  0
 *    __
 * 1 |__| 3
 * 	  2 
 * @author logan.collier
 *
 */
public abstract class GameToken {
	
	private Tokens name;
	
	private Direction front;
	private Direction side1;
	private Direction back;
	private Direction side3;
	
	private Direction beamIn;
	private Direction beamOut;
	
	public boolean beam_in_front = false;
	public boolean beam_in_side1 = false;
	public boolean beam_in_back = false;
	public boolean beam_in_side3 = false;
	
	private int position_x;
	private int position_y;
	private beam b;
	
	public GameToken(Direction facing,int x, int y) {
		this.position_x = x;
		this.position_y = y;
		this.setFrontFacing(facing);
		//sendBeamOut();
	}
	public abstract void sendBeamOut();
	public void setBeam(beam b) {
		this.b = b;
		this.setBeamIn(b.getCurrentDirection());
		
	}
	private void setOrientation() {
		if(this.front == Direction.NORTH) {
			this.side1 = Direction.WEST;
			this.back = Direction.SOUTH;
			this.side3 = Direction.EAST;
		}
		else if(this.front == Direction.WEST) {
			this.side1 = Direction.SOUTH;
			this.back = Direction.EAST;
			this.side3 = Direction.NORTH;
		}
		else if(this.front == Direction.SOUTH) {
			this.side1 = Direction.EAST;
			this.back = Direction.NORTH;
			this.side3 = Direction.WEST;
		}else {
			this.side1 = Direction.NORTH;
			this.back = Direction.WEST;
			this.side3 = Direction.SOUTH;
		}
	}
	public int getX() {
		return this.position_x;
	}
	public int getY() {
		return this.position_y;
	}
	protected void setTokenName(Tokens name) {
		this.name = name;
	}
	public Tokens getTokenName() {
		return this.name;
	}
	public void setBeamIn(Direction in) {
		if(in == this.front) {
			this.beam_in_front = true;
		}
		else if(in == this.side1) {
			this.beam_in_side1 = true;
		}
		else if(in == this.back) {
			this.beam_in_back = true;
		}
		else if(in == this.side3) {
			this.beam_in_side3 = true;
		}
		this.beamIn = in;
	}
	public void setBeamOut(Direction newOut) {
		this.beamOut = newOut;
		//this.b.setCurrentDirection(newOut);
	}
	public void setFrontFacing(Direction newDir) {
		this.front = newDir;
		setOrientation();
	}
	public Direction getDirectionIn() {
		return this.beamIn;
	}
	public Direction getDirectionOut() {
		return this.beamOut;
	}
	public Direction getFront() {
		return this.front;
	}
	public Direction getSideOne() {
		return this.side1;
	}
	public Direction getBack() {
		return this.back;
	}
	public Direction getSideThree() {
		return this.side3;
	}
	public void print() {
		String cell = "|";
		
			
		if(this.name.equals(Tokens.LASER)) {
			cell = cell.concat("L");
		}
		else if(this.name == Tokens.TARGET_MIRROR) {
			cell = cell.concat("TM");
		}
		else if(this.name == Tokens.CHECK_POINT) {
			cell = cell.concat("CP");
		}
		else if(this.name == Tokens.DOUBLE_MIRROR) {
			cell = cell.concat("DM");
		}
		else if(this.name == Tokens.CELL_BLOCKER) {
			cell = cell.concat("B");
		}
		else if(this.name == Tokens.NONE) {
			cell = cell.concat(" ");
		}
		else {
			cell = cell.concat(" ");
		}
		cell = cell.concat("|");
		if(this.beamIn != Direction.BLOCKED) {
			if(this.beamOut == Direction.EAST || this.beamOut == Direction.WEST) {
				cell = cell.concat("**");
			}
			else if(this.beamOut == Direction.NORTH || this.beamOut == Direction.SOUTH) {
				cell = cell.concat("**");
			}else {
				cell = cell.concat("  ");
			}
		}
		System.out.print(cell);
	}
}
