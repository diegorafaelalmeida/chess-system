package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Erro: � necessario pelo menos 1 linha e uma coluna para criar o tabuleiro");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Posi��o invalida");
		}
		return pieces[row][column];
	}
	
	// Sobrecarga do m�todo
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posi��o invalida");
		}
		return pieces[position.getRow()][position.getColumn()];		
	}
	public void placePiece(Piece piece, Position position) {
		if(threresAPiece(position)) {
			throw new BoardException("J� existe uma pe�a na posi��o: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {		
		return row >=0 && row < rows && column >=0 && column < columns;
	}
	
	//Programa��o recursiva + sobracarga de m�todo!
	public boolean positionExists(Position position){
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean threresAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posi��o invalida");
		}
		return piece(position) != null;
	}
	
	
}
