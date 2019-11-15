package assignment44;

public class Bench {

	public static void main(String[] args) {
		DoorWidget door = new DoorWidget();
		door.closeDoors();
		System.out.println(door.getDoorState());
	}

}
