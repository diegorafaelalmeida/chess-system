package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch(){
		board = new Board(8,8);		
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCollum()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j = 0; j < board.getCollum(); j++) {
				//DownCasting "O obj ChessPiece se transformou em obj Piece"
					mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
}
