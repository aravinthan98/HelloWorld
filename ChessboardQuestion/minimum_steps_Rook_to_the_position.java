package ChessboardQuestion;

import java.util.Scanner;
//Given an 8*8 empty chessboard in which a rook is placed at a position (X, Y).
// Your task is to find the minimum steps Rook will take to go to the position (1, 1).
public class minimum_steps_Rook_to_the_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(X != 1 && Y != 1){
            System.out.print(2);

        }
        else if(X == 1 && Y == 1){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
}
