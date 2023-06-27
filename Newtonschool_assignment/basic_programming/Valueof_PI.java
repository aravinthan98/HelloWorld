package Newtonschool_assignment.basic_programming;

import java.util.Scanner;
//Given an integer N. Print the value of PI with precision upto N decimal places.

//Sample Input 1:
//4
//
//Output:
//3.1416
public class Valueof_PI {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double pi=2*Math.acos(0.0);
        pi=Math.round(pi*Math.pow(10,N))/Math.pow(10,N);
        System.out.println(pi);

        // Your code here
    }
}
