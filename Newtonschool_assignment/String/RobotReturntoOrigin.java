package Newtonschool_assignment.String;

import java.util.Scanner;

//There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
//You have given a string of moves that represents the move sequence of the robot where moves[i] represent its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
//Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
//Sample Input:
//UD
//
//Sample Output:
//True
public class RobotReturntoOrigin {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int i=0;
        int row=0;
        int col=0;
        while(i<n){
            if(s.charAt(i)=='R'){
                row +=1;
            }
            else if(s.charAt(i)=='L'){
                row -=1;
            }
            else if(s.charAt(i)=='U'){
                col +=1;
            }
            else if(s.charAt(i)=='D'){
                col -=1;
            }
            else{
                continue;
            }
            i++;
        }
        if((row==0)&&(col==0)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        // Your code here
    }

}
