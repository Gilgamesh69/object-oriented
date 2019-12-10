package assignment5;

public class CellBlocker extends GameToken{

	public CellBlocker(Direction facing) {
		super(facing);
	}

	@Override
	public void sendBeamOut() {
		this.setBeamOut(Direction.BLOCKED);
		
	}


}
