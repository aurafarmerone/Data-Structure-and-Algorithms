public class NQUEENS {

    public static void main(String[] args) {
        int n =4;
        // creating boards
        char board[][] = new char[n][n];

        for(int i=0; i<board.length ; i++){
            for(int j=0; j<board.length ; j++){
            board[i][j] = '.';
            }
        }

        nqueen(board, 0); 
    }

    public static void nqueen(char board[][] , int i){
        if(i == board.length){
            printBoard(board);
            return;
        }
        // fitting queen
        for(int j=0 ; j<board.length ; j++){

            if(isSAFE(board, i, j)){

            board[i][j] = 'Q'; // sitting queen
            nqueen(board, i+1);
            board[i][j] = '.'; // standup queen

            }
           
        }
    }

    public static boolean isSAFE(char board[][], int row , int col){
        
        // vertically
        for(int i=row-1; i >= 0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left diagonal
        for(int i=row-1 , j=col-1; i >= 0 && j>=0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal
        for(int i=row-1 , j=col+1; i >= 0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("-----CHESS BOARD------");
         for(int i=0; i<board.length ; i++){
            for(int j=0; j<board.length ; j++){
            System.out.print(" "+board[i][j]+" "); 
            }
            System.out.println();
        }
    }
}