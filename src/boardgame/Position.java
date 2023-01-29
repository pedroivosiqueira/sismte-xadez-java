package boardgame;

public class Position {
	//ARGUMENTOS
	private Integer row;
	private Integer column;
	
	//CONSTRUTOR COM ARGUMENTO
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}
	
	//GETTERS AND SETTERS
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//PLOTAGEM
	public String toString () {
		return row + ", " + column;
	}	
}
