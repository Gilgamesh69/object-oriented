package assignment5;

public class TargetMirror extends GameToken{

	private boolean targetIlluminated = false;
	/**
	 * Front = target
	 * Side 1 = Mirror
	 * Back = Mirror
	 * Side 3 = Blocked
	 */
	public TargetMirror(Direction facing, int x, int y) {
		super(facing, x, y);
		super.setTokenName(Tokens.TARGET_MIRROR);
	}
	/**
	 * set targetIlluminated = true
	 * set beam out = false
	 */
	public void setTarget() {
		this.targetIlluminated = true;
		System.out.println("TARGET HIT");
	}
	public void sendBeamOut(){
		
		if(this.getDirectionIn() == this.getSideOne()) {
			this.setBeamOut(Direction.BLOCKED);
		}
		else if(this.getDirectionIn() == this.getBack()) {
			this.setBeamOut(this.getSideThree());
		}
		else if(this.getDirectionIn() == this.getFront()) {
			setTarget();
			this.setBeamOut(Direction.BLOCKED);
		}
		else if(this.getDirectionIn() == this.getSideThree()) {
			this.setBeamOut(this.getBack());
			//System.out.println(this.getDirectionOut());
		}
		
	}
}
