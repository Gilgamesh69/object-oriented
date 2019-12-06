package assignment5;

public class Laser extends GameToken{

	public Laser(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.LASER);
	}
	public void sendBeam() {
		this.setBeamOut(this.getFront());
	}
	public void setBeam() {
		this.setBeamOut(this.getFront());
		
	}
	

}
