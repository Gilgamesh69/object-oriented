package assignment4;

public class FloorMediator {
	public Floor1 floor1;
	public Floor2 floor2;
	public Floor3 floor3;
	private State currentState;
	public FloorMediator() {
		floor1 = new Floor1();
		floor2 = new Floor2();
		floor3 = new Floor3();
		initiallize();
	}
	private void initiallize() {
		currentState = floor1;
		currentState.setDoorsOpen(true);
	}
}
