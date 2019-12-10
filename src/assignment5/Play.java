package assignment5;

public class Play {

	public static void main(String[] args) {
		GameGrid grid = new GameGrid(6,6);
		Laser l = new Laser(Direction.NORTH);
		grid.addToken(l, 3, 3);
		TargetMirror tm = new TargetMirror(Direction.SOUTH);
		grid.addToken(tm, 1, 3);
		TargetMirror tm1 = new TargetMirror(Direction.WEST);
		grid.addToken(tm1, 1, 0);
		MapBeam m = new MapBeam(grid);
		grid.print();
		//System.out.println(tm.getDirectionOut());
		//grid.printGrid();

	}

}
