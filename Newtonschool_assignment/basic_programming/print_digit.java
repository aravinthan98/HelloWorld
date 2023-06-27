package Newtonschool_assignment.basic_programming;

import java.util.Scanner;
//Given a natural number N, your task is to print all the digits of the number in English words.
// The words have to separate by space and in lowercase English letters.
public class print_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=123456;
        Print_Digits(n);
    }
    static void Print_Digits(int N){
        String word[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int digit[]=new int[10];
        int j=0;

        while(N!=0){
            digit[j]=N%10;
            N=N/10;
            j++;
        }
        for(int i=j-1;i>=0;i--){
            System.out.print(word[digit[i]]+" ");
        }

    }
}
