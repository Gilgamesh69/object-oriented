package assignment5;

public class TargetMirror extends GameToken{

	private boolean targetIlluminated = false;
	/**
	 * Front = target
	 * Side 1 = Mirror
	 * Back = Mirror
	 * Side 3 = Blocked
	 */
	public TargetMirror(Direction facing) {
		super(facing);
		super.setTokenName(Tokens.TARGET_MIRROR);
	}
	/**
	 * set targetIlluminated = true
	 * set beam out = false
	 */
	public void setTarget() {
		this.targetIlluminated = true;
	}
	public void setBeam() {
		if(this.getDirectionIn() == this.getSideOne()) {
			this.setBeamOut(this.getBack());
		}
		else if(this.getDirectionIn() == this.getBack()) {
			this.setBeamOut(this.getSideOne());
		}
		else if(this.getDirectionIn() == this.getFront()) {
			setTarget();
			this.setBeamOut(Direction.BLOCKED);
		}
		else if(this.getDirectionIn() == this.getSideThree()) {
			this.setBeamOut(Direction.BLOCKED);
		}	
	}
}
