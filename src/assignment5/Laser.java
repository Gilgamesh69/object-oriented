package assignment5;

public class Laser extends GameToken{


	public Laser(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.LASER);
	}
	public void sendBeamOut() {
		this.setBeamOut(this.getFront());
	}

	public void fire(GameGrid g) {
		beam b = new beam(g,this.x,this.y);
		b.map();
	}
	

}
