import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class NQueen {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
       for(char[]r:board){
        Arrays.fill(r,'.');
       }
    }
    private static void solution(char[][] board, int r, List<List<String>> res){
        if(r==board.length){
            List<String> list=new ArrayList<>();
            for(char[] row:board){
                list.add(new String(row));
            }
            res.add(list);
            return;
        }
        for(int c=0;c<board.length;c++){
            if(isValid(board,r,c)){
                board[r][c]='Q';
                solution(board,r+1,res);
                board[r][c]='.';
            }
        }
    }
    private static boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static List<String> createList(char[][] board){
        List<String> list=new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));
        }
        return list;
    }
    // public static void main(String[] args) {
    //     int n=4;
    //     System.out.println(solveNQueens(n));
    // }
}
