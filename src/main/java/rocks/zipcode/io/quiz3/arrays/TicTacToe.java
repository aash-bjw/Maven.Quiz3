package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {

        return new String[] {board[0][value],board[1][value],board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) && row[1].equals(row[2]);
        }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return column[0].equals(column[1]) && column[1].equals(column[2]);
    }

    public Boolean isDiagonalHomogeneous(String[] diagonal) {
        return diagonal[0].equals(diagonal[1]) && diagonal[1].equals(diagonal[2]);
    }

    public String getWinner() {
     return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
