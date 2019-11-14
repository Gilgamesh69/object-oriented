package assignment4;

public abstract class Floor implements State{
	private String floorName;
	private int floorID;
	
	public Floor() {
		
	}
	@Override
	public void arrive() {
		System.out.println("Arriving at " + floorName);
	}
	public int getFloorID() {
		return floorID;
	}
	public void setFloorID(int floorID) {
		this.floorID = floorID;
	}

}
