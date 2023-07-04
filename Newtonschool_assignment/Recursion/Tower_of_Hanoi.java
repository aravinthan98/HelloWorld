package Newtonschool_assignment.Recursion;

import java.util.Scanner;
//From wiki-
//The Tower of Hanoi is a mathematical puzzle where we have 3 rods and N disks. The puzzle starts
// with all the disks in ascending order of size on the first row. The objective of the puzzle is
// to move the entire stack to another rod, obeying the following simple rules:
//
//1. Only one disk can be moved at a time.
//2. Each move consists of taking the upper disk from one of the stacks and placing it on top
// of another stack or on an empty rod.
//3. No larger disk may be placed on top of a smaller disk.
//-----x--x--x------
//Let the rods have names A, B and C. Given N number of disks, numbered 1 to N from top to bottom, display all the moves required to move the disks from rod A to C in minimum number of steps.
public class Tower_of_Hanoi {
    static void towerOfHanoi(int n, char from_rod,char to_rod, char aux_rod){
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println(n + ":" + from_rod + "->"+ to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        towerOfHanoi(N, 'A', 'C', 'B');
        // Your code here
    }
}
