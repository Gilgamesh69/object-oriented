package assignment5;

public class DoubleMirror extends GameToken{

	public DoubleMirror(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.DOUBLE_MIRROR);
	}

	@Override
	public void sendBeamOut(){
		
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
