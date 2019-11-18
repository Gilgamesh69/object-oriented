package assignment44;

public abstract class Colleague {
	private String name;
	private int position;
	Mediator mediator;
	
	public Colleague(Mediator mediator,String name, int id) {
		this.mediator = mediator;
		this.name = name;
		this.position = id;
	}

	public int getPosition() {
		return position;
	}
	public void arrive() {
		System.out.println("*ding* The elevator arrives at "+ name);
	}
	public void nothing() {
		System.out.println("nothing happens...");
	}
	public void goingUp() {
		System.out.println("going up...");
	}
	public void goingDown() {
		System.out.println("going down...");
	}

}
