package assignment5;
import java.util.ArrayList;

public class beam {
	private GameGrid grid;
	public int str_x, str_y;
	public ArrayList<Direction> beamPath;
	public Direction current;
	public boolean beamStop = false;
	
	public beam(GameGrid grid,int start_x,int start_y) {
		this.grid = grid;
		this.beamPath = new ArrayList<Direction>();
		map();
	}
	public void map() {
			
		int new_x = str_x;
		int new_y = str_y;
		GameToken cur_tile = grid.cols.get(str_x).getTile(str_y);
		while(!beamStop) {
			if(new_x >= grid.len_x-1 || new_y >= grid.len_y-1 || new_x < 0 || new_y < 0) {
				System.out.println("BREAKING");
				break;
			}
			if(cur_tile.getDirectionOut() == Direction.NORTH) {
				beamPath.add(cur_tile.getDirectionOut());
				new_y--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeam(this);
			}
			else if(cur_tile.getDirectionOut() == Direction.SOUTH) {
				beamPath.add(cur_tile.getDirectionOut());
				new_y++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.SOUTH);
			}
			else if(cur_tile.getDirectionOut() == Direction.EAST) {
				beamPath.add(cur_tile.getDirectionOut());
				new_x--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.EAST);
			}
			else if(cur_tile.getDirectionOut() == Direction.WEST) {
				beamPath.add(cur_tile.getDirectionOut());
				new_x++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.WEST);
			}
			else {
				beamStop = true;
			}
		}
		System.out.println(beamPath);
		
	}
	public void setCurrentDirection(Direction d) {
		this.current = d;
	}
	public Direction getCurrentDirection() {
		return this.current;
	}

}
