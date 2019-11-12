package assignment4;

public class Floor1 extends Floor{
	
	public Floor1() {
		super.floorName = "Floor 1";
	}

	@Override
	public void clickButton1() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		if(super.currentlyOn) {
			System.out.println("Nothing happens");
		}
		
	}

	@Override
	public void clickButton2() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		super.setCurrentlyOn(false);
		System.out.println("going up...");
		
	}

	@Override
	public void clickButton3() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		super.setCurrentlyOn(false);
		System.out.println("going up...");
		
	}

}
