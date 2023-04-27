package arrays;

import java.util.Stack;
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
public class SquarerootofaNumber69 {
    public static void main(String[] args) {
        int n=81;
        System.out.print("squar root of the given number is "+mySqrt(n));
    }
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        double t=0;  //11
        double sqrt=x/2;//5.5

        while((t-sqrt)!= 0){
            t=sqrt;            //t=4.5//3.25
            sqrt=(t+(x/t))/2;  //3.75
        }

        int ans=(int)sqrt;//converted double to int to rounded down

        return ans;


    }
}
