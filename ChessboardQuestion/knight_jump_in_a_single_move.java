package ChessboardQuestion;
//Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y).
// Your task is to find the number of positions knight can jump into in a single move.
public class knight_jump_in_a_single_move {
    public static void main(String[] args) {
        int x=4;
        int y=3;
        System.out.print(Knight(x,y));
    }
    static int Knight(int X, int Y) {
        int count = 0;
        if (ans(X + 1, Y + 2)) {
            count++;
        }
        if (ans(X + 1, Y - 2)) {
            count++;
        }
        if (ans(X - 1, Y + 2)) {
            count++;
        }
        if (ans(X - 1, Y - 2)) {
            count++;
        }
        if (ans(X + 2, Y - 1)) {
            count++;
        }
        if (ans(X + 2, Y + 1)) {
            count++;
        }
        if(ans(X-2,Y+1)){
            count++;
        }
        if(ans(X-2,Y-1)){
            count++;
        }
        return count;
    }
    static boolean ans(int a, int b){
        if(a <= 8 && a >=1 && b <= 8 && b >= 1){
            return true;
        }
        else{
            return false;
        }
    }

}
