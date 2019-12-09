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
	
	public GameToken(Direction facing) {
		this.setFrontFacing(facing);
		sendBeamOut();
	}
	public abstract void sendBeamOut();
	
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
	protected void setTokenName(Tokens name) {
		this.name = name;
	}
	public Tokens getTokenName() {
		return this.name;
	}
	public void setBeamIn(Direction in) {
		this.beamIn = in;
	}
	public void setBeamOut(Direction newOut) {
		this.beamOut = newOut;
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

}
