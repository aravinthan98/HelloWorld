package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-
//
//Consider a matrix of size 5*4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//17 18 19 20
//
//ZigZag traversal:-
//
//1
//5 2
//9 6 3
//13 10 7 4
//17 14 11 8
//18 15 12
//19 16
//20
public class Matrix_ZigZag_Traversal {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = j; i >= 0; i--) {
                if ((j - i) >= m) {
                    break;

                }
                System.out.print(arr[i][j - i] + " ");
            }
            System.out.println("");
        }

        for (int j = 1; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if ((j + n - 1 - i) >= m) {
                    break;
                }
                System.out.print(arr[i][j + (n - 1 - i)] + " ");
            }
            System.out.println("");
        }
    }
}
