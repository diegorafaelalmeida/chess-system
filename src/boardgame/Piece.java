package boardgame;

public class Piece {

	protected Position position; 
	private Board board;
	
	public Piece(Board board) {		
		this.board = board;	
		position = null;
	}

	// # Somente classes do mesmo pacote ou subclasses
	// # poderam acessar um método protected.
	protected Board getBoard() {
		return board;
	}


	
	
}
