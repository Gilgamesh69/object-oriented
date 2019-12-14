package assignment5;


public class LoadToken {

	private int posX;
	private int posY;
	private Tokens gamePiece;
	private Direction orientation;

	public LoadToken(int x, int y, char _GamePiece, char _Orientation){
		this.posX = x;
		this.posY = y;
		setPiece(_GamePiece);
		setOrientation(_Orientation);
	}
	
	public int getX(){
		return this.posX;
	}
	
	public int getY(){
		return this.posY;
	}
	
	public void setPiece(char gPiece){
		if(gPiece == 'T'){
			this.gamePiece = Tokens.TARGET_MIRROR;
		}
		else if(gPiece == 'L'){
			this.gamePiece = Tokens.LASER;
		}
		else if(gPiece == 'B'){
			this.gamePiece = Tokens.BEAM_SPLITTER;
		}
		else if(gPiece == 'M'){
			this.gamePiece = Tokens.DOUBLE_MIRROR;
		}
		else if(gPiece == 'Z'){
			this.gamePiece = Tokens.TARGET_MIRROR;
		}
		else if(gPiece == 'P'){
			this.gamePiece = Tokens.CHECK_POINT;
		}
		else if(gPiece == 'K'){
			this.gamePiece = Tokens.CELL_BLOCKER;
		}
		else{
			this.gamePiece = Tokens.NONE;
		}
		
	}
	
	public void setOrientation(char o){
		if(o == 'N'){
			this.orientation = Direction.NORTH;
		}
		else if(o == 'E'){
			this.orientation = Direction.EAST;
		}
		else if(o == 'S') {
			this.orientation = Direction.SOUTH;
		}
		else if(o == 'W'){
			this.orientation = Direction.WEST;
		}
		else{
			System.out.println("Logan licks lint");
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Tokens getToken() {
		return gamePiece;
	}

	public void setGamePiece(Tokens gamePiece) {
		this.gamePiece = gamePiece;
	}

	public Direction getOrientation() {
		return orientation;
	}

	public void setOrientation(Direction orientation) {
		this.orientation = orientation;
	}
}
