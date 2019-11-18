package assignment44;

public class ElevatorClient {
	
	private ElevatorMediator mediator;
	private Floor currentFloor;
	
	public ElevatorClient() {
		
		mediator = new ElevatorMediator();
		Floor floor1 = new Floor(mediator, "Floor 1", 0);
		Floor floor2 = new Floor(mediator, "Floor 2", 1);
		Floor floor3 = new Floor(mediator, "Floor 3", 2);
		
		mediator.addFloor(floor1);
		mediator.addFloor(floor2);
		mediator.addFloor(floor3);
		currentFloor = floor1;
		//Construct 3 floors and map buttons to them
		
	}
	public Floor getCurrentFloor() {
		return currentFloor;
	}
	public void press1() {
		System.out.println("1 pressed");
		currentFloor = mediator.pressButton(0,currentFloor);
	}
	public void press2() {
		System.out.println("2 pressed");
		currentFloor = mediator.pressButton(1,currentFloor);
	}
	public void press3() {
		System.out.println("3 pressed");
		currentFloor = mediator.pressButton(2,currentFloor);
	}
}
