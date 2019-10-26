package boardgame;

public abstract class Piece {

	protected Position position; 
	private Board board;
	
	public Piece(Board board) {		
		this.board = board;	
		position = null;
	}

	// # Somente classes do mesmo pacote ou subclasses
	// # poderam acessar um m�todo protected.
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	//hook opera��o padr�o que depende de um m�todo abstrato ->possibleMoves
	public boolean possibleMove() {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//hook opera��o padr�o que depende de um m�todo abstrato ->possibleMoves
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i =0; i<mat.length; i ++) {
			for(int j=1; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
