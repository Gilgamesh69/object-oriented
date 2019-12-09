package assignment5;

public class NoneToken extends GameToken{

	public NoneToken(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.NONE);
	}

	@Override
	public void sendBeamOut() {
		this.setBeamOut(this.getDirectionIn());
	}


}
