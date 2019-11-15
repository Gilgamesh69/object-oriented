package assignment44;

public class ElevatorButton {
	private int buttonID; //maps to floor number
	public ElevatorButton(int id) {
		this.buttonID = id;
	}
	public int pressButton() {
		return buttonID;
	}
	public void printButtonPress() {
		System.out.println(buttonID +" pressed");
	}

}
