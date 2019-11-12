package assignment4;

public class Floor2 extends Floor{
	public Floor2() {
		super.floorName = "Floor 2";
	}

	@Override
	public void clickButton1() {
		if(super.doorsOpen) {
			super.setDoorsOpen(false);
			super.printDoorStatus();
		}
		
	}

	@Override
	public void clickButton2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickButton3() {
		// TODO Auto-generated method stub
		
	}
}
