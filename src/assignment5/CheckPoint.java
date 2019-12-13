package assignment5;

public class CheckPoint extends GameToken{

	public CheckPoint(Direction facing, int x, int y) {
		super(facing, x, y);
		super.setTokenName(Tokens.CHECK_POINT);
	}

	@Override
	public void sendBeamOut() {
		this.setBeamOut(this.getDirectionIn());
		
	}


}
