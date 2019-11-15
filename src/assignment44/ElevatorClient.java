package assignment44;

public class ElevatorClient {
	private FloorFactory floors;
	private ElevatorMediator mediator;
	
	public ElevatorClient() {
		mediator = new ElevatorMediator();
		//Construct 3 floors and map buttons to them
		floors = new FloorFactory(3);
	}
	public void pressbutton1() {
		mediator.pushButton(floors.get)
	}
}
