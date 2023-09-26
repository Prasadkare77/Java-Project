public class Sudoku {
    public boolean isSafe(char[][] board, int row, int col, int number){
        //column
        for (int i=0; i<board.length; i++){
            if (board[i][col]==(char) (number+'0')){
                return false;
            }
        }
        //row
        for (int j=0; j<board.length; j++){
            if (board[row][j]==(char) (number+'0')){
                return false;
            }
        }
        //grid
        int sr=3*(row/3);
        int sc=3*(col/3);
        for (int i=sr; i<sr+3; i++){
            for (int j=sc; j<sc+3; j++){
                if (board[i][j]==(char)(number+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int row, int col){
        int nrow=0;
        int ncol=0;
        if(col==board.length-1){
            nrow=row+1;
            ncol=0;
        }else {
            nrow=row;
            ncol=col+1;
        }
        if (board[row][col]!='.'){
            if (helper(board,nrow,ncol)){
                return true;
            }
        } else {
            // fil the place
            for (int i=1; i<=9; i++){
                if(isSafe(board,nrow,ncol,i)){
                    board[row][col]=(char)(i+'0');
                    if (helper(board,nrow,ncol))
                        return true;
                    else
                        board[nrow][ncol]='.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board){
        helper(board,0,0);
    }
    public static void main(String arg[][]){

    }
}
