package assignment4;

public class Floor3 extends Floor{
	public Floor3() {
		super.floorName = "Floor 3";
	}

	@Override
	public void clickButton1() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		super.setCurrentlyOn(false);
		System.out.println("going down...");
		
	}

	@Override
	public void clickButton2() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		super.setCurrentlyOn(false);
		System.out.println("going down...");
		
	}

	@Override
	public void clickButton3() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		if(super.currentlyOn) {
			System.out.println("Nothing happens");
		}
		
	}
}
