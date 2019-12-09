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
		//get starting tile
		for(GameTileColumn i : grid.cols) {
			for(GameTile j : i.col) {
				if(j.token != null) {
					if(j.token.getTokenName() == Tokens.LASER) {
						str_x = j.getX();
						str_y = j.getY();
						break;
					}
				}
			}
		}
		int new_x = str_x;
		int new_y = str_y;
		GameTile cur_tile = grid.cols.get(str_x).getTile(str_y);
		while(!beamStop) {
			if(new_x >= grid.len_x-1 || new_y >= grid.len_y-1 || new_x <= 0 || new_y <= 0) {
				break;
			}
			if(cur_tile.getBeamOut() == Direction.NORTH) {
				beamPath.add(cur_tile.getBeamOut());
				new_y--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.NORTH);
				if(cur_tile.token == null) {
					cur_tile.setBeamOut(Direction.NORTH);
				}
			}
			else if(cur_tile.getBeamOut() == Direction.SOUTH) {
				beamPath.add(cur_tile.getBeamOut());
				new_y++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.SOUTH);
				if(cur_tile.token == null) {
					cur_tile.setBeamOut(Direction.SOUTH);
				}
			}
			else if(cur_tile.getBeamOut() == Direction.EAST) {
				beamPath.add(cur_tile.getBeamOut());
				new_x--;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.EAST);
				if(cur_tile.token == null) {
					cur_tile.setBeamOut(Direction.EAST);
				}
			}
			else if(cur_tile.getBeamOut() == Direction.WEST) {
				beamPath.add(cur_tile.getBeamOut());
				new_x++;
				cur_tile = grid.cols.get(new_y).getTile(new_x);
				cur_tile.setBeamIn(Direction.WEST);
				if(cur_tile.token == null) {
					cur_tile.setBeamOut(Direction.WEST);
				}
			}
			else {
				beamStop = true;
			}
		}
		
	}
	

}
