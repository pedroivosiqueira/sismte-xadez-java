package boardgame;

public class Board {
	//ARGUMENTOS
	public Integer rows;
	public Integer columns;
	
	//ASSOCIAÇÃO
	private Piece[][] pieces;
	
	//CONSTRUTOR COM ARGUMENTO
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//GETTERS AND SETTERS
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}	
}
