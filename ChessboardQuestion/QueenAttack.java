package ChessboardQuestion;

import java.util.Scanner;

//In an 8X8 chessboard. Given the position of the Enemy Queen(X, Y) and the King(P, Q)
// your task is to check whether the king is in an attacking position by the queen i.e.
// you have to check if the king is in the check position by the queen or not.
public class QueenAttack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.print(QueenAttack(x,y,p,q));

    }
    public static int QueenAttack(int X, int Y, int P, int Q){
        if (X == P){
            return 1;
        }
        if (Y == Q){
            return 1;
        }
        int a = Math.abs(X - P);
        int b = Math.abs(Y - Q);
        if (a == b){
            return 1;
        }
        return 0;
    }
}
