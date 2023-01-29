package boardgame;

public class Piece {
	//ARGUMENTOS
	protected Position position;
	
	//ASSOCIAÇÕES
	private Board board;

	//CONSTRUTORES
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	//GETTERS
	protected Board getBoard() {
		return board;
	}	
}
