package Newtonschool_assignment.basic_programming;

import java.util.Scanner;

public class Leapyear {
    public static void main (String[] args)
    {
        //Capture the user's input
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        int n = scanner.nextInt();
        LeapYear(n);


    }
    static void LeapYear(int year){
        if(year%400==0){
            System.out.print("YES");
        }
        else if((year%4==0)&&(year%100 !=0)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

        //Write code here
    }
}
