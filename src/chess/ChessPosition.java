package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {		
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro iniciando a posi��o do xadrez: as posi��es variam de a1 a h8!");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}


	public int getRow() {
		return row;
	}

	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		// (char) casting para converter para caractere
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		// "" for�a o compilador a entender a concatena��o de string
		return "" + column + row;
	}
}
