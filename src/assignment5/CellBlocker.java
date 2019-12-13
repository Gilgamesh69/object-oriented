package assignment5;

public class CellBlocker extends GameToken{

	public CellBlocker(Direction facing, int x, int y) {
		super(facing, x, y);
	}

	@Override
	public void sendBeamOut() {
		this.setBeamOut(Direction.BLOCKED);
	}


}
