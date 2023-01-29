package boardgame;

public class Board {
	//ARGUMENTOS
	public Integer rows;
	public Integer columns;
	
	//ASSOCIAÇÕES
	private Piece[][] pieces;
	
	//CONSTRUTORES
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
	
	//METODOS
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
