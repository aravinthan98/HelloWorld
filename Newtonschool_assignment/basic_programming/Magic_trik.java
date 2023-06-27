package Newtonschool_assignment.basic_programming;

import java.util.Scanner;

//Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
//1. Think of a number X(don't tell Sara)
//2. Add A(Given by Sara) to it.
//3. Double the sum in your mind.
//4. Add an even number B(Given by Sara) to it.
//5. Half the amount
//6. Subtract the initial number which you had taken from the sum
//After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
public class Magic_trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum = ((a * 2) + b) / 2;
        System.out.print(sum);
    }
}

