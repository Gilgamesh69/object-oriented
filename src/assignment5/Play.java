package assignment5;

public class Play {

	public static void main(String[] args) {
		LoadCard lc = new LoadCard();
		//lc.print();
		GameGrid grid = new GameGrid(lc.getLoadedTokens());
		grid.print();
		grid.startLaser();
		grid.print();
		/**
		Laser l = new Laser(Direction.NORTH);
		grid.addToken(l, 3, 3);
		//TargetMirror tm = new TargetMirror(Direction.SOUTH);
		DoubleMirror tm = new DoubleMirror(Direction.SOUTH);
		grid.addToken(tm, 1, 3);
		TargetMirror tm1 = new TargetMirror(Direction.WEST);
		DoubleMirror dm = new DoubleMirror(Direction.NORTH);
		grid.addToken(dm, 4, 4);
		grid.addToken(tm1, 1, 0);
		//MapBeam m = new MapBeam(grid);
		l.fire(grid);
		grid.print();
		**/
		//System.out.println(tm.getDirectionOut());
		//grid.printGrid();

	}

}
