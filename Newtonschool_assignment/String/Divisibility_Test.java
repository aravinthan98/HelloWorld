package Newtonschool_assignment.String;

import java.util.Scanner;

public class Divisibility_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();

        int rem=0;

        for(int i=0;i<n;i++){
            int k=s.charAt(i)-'0';
            int num=rem*10+k;
            rem =(num % 30) ;

        }
        if(rem==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
