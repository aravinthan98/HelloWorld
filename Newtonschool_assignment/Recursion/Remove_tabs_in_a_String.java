package Newtonschool_assignment.Recursion;

import java.util.Scanner;

//Write a recursive program to remove all tabs or spaces from a string.
public class Remove_tabs_in_a_String {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        solve(s,n-1);
        // Your code here
    }
    public static void solve(String s,int n){
        if(n<0){
            return;
        }
        if(s.charAt(n)==' '){
            solve(s,n-1);

        }
        else{
            solve(s,n-1);
            System.out.print(s.charAt(n)+"");
        }
    }
}
