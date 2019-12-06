package assignment5;

public class Play {

	public static void main(String[] args) {
		GameGrid grid = new GameGrid(6,6);
		Laser l = new Laser(Direction.NORTH);
		grid.addToken(l, 3, 3);
		TargetMirror tm = new TargetMirror(Direction.NORTH);
		grid.addToken(tm, 1, 4);
		grid.print();
		//grid.printGrid();

	}

}
