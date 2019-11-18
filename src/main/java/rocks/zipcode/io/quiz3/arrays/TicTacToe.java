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
    }

    public String[] getRow(Integer value) {
        return null;
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for(int i = 0; i <=2; i++){
            if((board[i][0].equals(rowIndex)) && (board[i][0] == board[i][1]) && (board[i][1] == board[i][2])){
                return true;
            }

//        if ((board[0][0].equals(rowIndex)) && (board[0][1].equals(rowIndex)) && (board[0][2].equals(rowIndex))) {
//            if((board[1][0].equals(rowIndex)) && (board[1][1].equals(rowIndex)) && (board[1][2].equals(rowIndex))){
//                if((board[2][0].equals(rowIndex)) && (board[2][1].equals(rowIndex)) && (board[2][2].equals(rowIndex))){
//                    return true;
//                }
//            }

        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
