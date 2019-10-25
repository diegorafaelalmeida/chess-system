package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch(){
		board = new Board(8,8);	
		initialStup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				//DownCasting "O obj ChessPiece se transformou em obj Piece"
					mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	// # recebe as coordenados do xadrez ex: a1,b5,h8 ... 
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		
	}
	
	private void initialStup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
	}
}
