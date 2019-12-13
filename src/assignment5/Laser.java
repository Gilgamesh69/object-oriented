package assignment5;

public class Laser extends GameToken{


	public Laser(Direction facing, int x, int y) {
		super(facing, x, y);
		super.setTokenName(Tokens.LASER);
	}
	public void sendBeamOut() {
		this.setBeamOut(this.getFront());
	}

	public void fire(GameGrid g) {
		beam b = new beam(g,this.getX(),this.getY());
		b.map();
	}
	

}
