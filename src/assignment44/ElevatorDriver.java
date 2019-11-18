package assignment44;

public class ElevatorDriver {

	public static void main(String[] args) {
		ElevatorClient elevator = new ElevatorClient();
		elevator.press2();
		elevator.press1();
		elevator.press3();
		elevator.press3();
		elevator.press1(); 
	}

}
