package assignment5;

public class BeamSplitter extends GameToken{
	/**
	 * 	front - start new beam
	 * side1 = reflect exsisting beam
	 * back = reflect exsisting beam
	 * side 3 = start new beam
	 *	 
	 * @param facing
	 */
	public BeamSplitter(Direction facing, int x, int y) {
		super(facing, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendBeamOut() {
		
		if(this.getDirectionIn() == this.getSideOne()) {
			this.setBeamOut(this.getBack());
		}
		else if(this.getDirectionIn() == this.getBack()) {
			this.setBeamOut(this.getSideOne());
		}
		else if(this.getDirectionIn() == this.getFront()) {
			this.setBeamOut(this.getSideThree());
		}
		else if(this.getDirectionIn() == this.getSideThree()) {
			this.setBeamOut(this.getFront());
		}
	}

}
