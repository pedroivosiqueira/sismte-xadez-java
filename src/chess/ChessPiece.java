package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	//ASSOCIAÇÕES
	private Color color;
	
	//CONSTRUTORES
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//GETTERS
	public Color getColor() {
		return color;
	}
	
	
	
	
	
}
