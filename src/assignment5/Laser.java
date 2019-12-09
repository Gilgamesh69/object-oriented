package assignment5;

public class Laser extends GameToken{

	public Laser(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.LASER);
		//System.out.println(super.getDirectionOut());
	}
	public void sendBeamOut() {
		this.setBeamOut(this.getFront());
	}
	

}
