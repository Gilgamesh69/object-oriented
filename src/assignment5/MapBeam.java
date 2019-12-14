package assignment5;

import java.util.ArrayList;

public class MapBeam {
	private GameGrid grid;
	public int str_x, str_y;
	public ArrayList<Direction> beamPath;
	public boolean beamStop = false;
	
	public MapBeam(GameGrid grid) {
		this.grid = grid;
		this.beamPath = new ArrayList<Direction>();
		map();
	}
	private void map() {
		//get beam starting tile
		int new_x = str_x;
		int new_y = str_y;
		GameToken cur_tile = grid.cols.get(grid.laser.getX()).getTile(grid.laser.getY());
		//System.out.println(grid.getCol(0).getTile(0).getTokenName());
		//System.out.println(grid.cols.get(4).getTile(0).getTokenName());
		//System.out.println(grid.laser.getX());
		//System.out.println(grid.laser.getY());
		while(!beamStop) {
			//
			cur_tile.sendBeamOut();
			//System.out.println(cur_tile.getDirectionOut());
			//System.out.println(cur_tile.getDirectionOut());
			if(new_x >= grid.len_x|| new_y >= grid.len_y || new_x < 0 || new_y < 0) {
				System.out.println("BREAKING");
				break;
			}
			if(cur_tile.getDirectionOut() == Direction.NORTH) {
				beamPath.add(cur_tile.getDirectionOut());
				new_y++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.NORTH);

			}
			else if(cur_tile.getDirectionOut() == Direction.SOUTH) {
				beamPath.add(cur_tile.getDirectionOut());
				new_y--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.SOUTH);
			}
			else if(cur_tile.getDirectionOut() == Direction.EAST) {
				beamPath.add(cur_tile.getDirectionOut());
				new_x++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.EAST);
			}
			else if(cur_tile.getDirectionOut() == Direction.WEST) {
				beamPath.add(cur_tile.getDirectionOut());
				new_x--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.WEST);
			}
			else {
				beamStop = true;
			}
		}
		System.out.println(beamPath);
		
	}
	

}
