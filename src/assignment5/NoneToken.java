package assignment5;

public class NoneToken extends GameToken{

	public NoneToken(Direction facing, int x, int y) {
		super(facing, x, y);
		super.setTokenName(Tokens.NONE);
	}
	@Override
	public void sendBeamOut() {
		this.setBeamOut(this.getDirectionIn());
	}


}
