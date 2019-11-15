package assignment44;

public class DoorWidget {
	
		private DoorStateContext door = new DoorStateContext();
		
		public void openDoors() {
			door.setState(true);
			door.doorState();
		}
		public void closeDoors() {
			door.setState(false);
			door.doorState();
		}
		public boolean getDoorState() {
			return door.getState();
		}

}
