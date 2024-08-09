import java.util.Scanner;

public class TicTacToe{
     public static void main(String[] args) {

        //printing the board
        Character[][] board=new Character[3][3];
        //intially we need to keep the board as the empty  //because it will points to null
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                board[row][col]=' ';
            }
        }
        //here we are strated from the x
        char player='x';
        boolean isgameOver=false;
        Scanner sc=new Scanner(System.in);//taking the next move and where they need to place val
        printBoard(board);
        //until game over we need to play game so using the while loop
        while(!isgameOver){
            //intially print the board and seeing the result
            
            System.out.println("player "+player+ " enter  " + "along row and col value : ");

            int row=sc.nextInt();
        
            int col=sc.nextInt();

            System.out.println();
            if(board[row][col]==' '){
                board[row][col]=player;//because value was the palyer
                //after placing the x we need to check the winning stiuation by passing the board
                isgameOver=haveWon(board,player);
                if(isgameOver){
                    System.out.println("player "+player+" has won");
                }else{
                    //so chance for the next player
                    if(player=='x'){
                        player='o';
                    }else{
                        player='x';
                    }
                }
            }else{
                //if not free means it filled so print invalid move
                System.out.println("Invalid move. Try again");
            }
            printBoard(board);
        }
    }
    
    public static boolean haveWon(Character[][] board, char player) {
        // check the rows
        for (int row = 0; row < board.length; row++) {
          if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
            return true;
          }
        }

        // check for col
        for (int col = 0; col < board[0].length; col++) {
          if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
            return true;
          }
        }

        // diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
          return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
          return true;
        }
        return false;
      }

      public static void printBoard(Character[][] board) {
        for (int row = 0; row < board.length; row++) {
          for (int col = 0; col < board[row].length; col++) {
            System.out.print(board[row][col] + " | ");
          }
          System.out.println();
        }
      }
}
