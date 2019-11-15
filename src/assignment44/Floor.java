package assignment44;

public class Floor {
	private String name;
	private int position;
	
	public Floor(String name, int id) {
		this.name = name;
		this.position = id;
	}
	public int getPosition() {
		return position;
	}
	public void arrive() {
		System.out.println("*ding* The elevator arrives at floor "+ name);
	}
	//prints if elevator goes up or down or nothing happens
	public void buttonPress(int floorNum) {
		if(floorNum > position) {
			System.out.println("Going up...");
		}
		else if( floorNum < position) {
			System.out.println("Going down...");
		}else {
			System.out.println("Nothing Happens");
		}
	}

}
