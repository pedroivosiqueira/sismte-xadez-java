package boardgame;

public class Piece {
	//ARGUMENTOS
	protected Position position;
	
	//ASSOCIAÇÃO
	private Board board;

	//CONSTRUTOR COM ARGUMENTO
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	//GETTERS
	protected Board getBoard() {
		return board;
	}	
}
