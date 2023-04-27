package searching;

import java.util.Scanner;
//Consider a set "S" of points (x, y) on the cartesian plane such that 1 <= x <= N and 1 <= y <=M
// where x, y are positive integers.
//You need to find number of line segments whose end points lies in set S such that
// the coordinates of the midpoint also lies in the set S.
//INPUT
//2
//3 3
//6 7
//
//OUTPUT
//8
//204
public class midPoint {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long sum = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int a = Math.min(i-1, n-i);
                    int b = Math.min(j-1, m-j);

                    a = 2*a + 1;
                    b = 2*b + 1;

                    sum += (a*b - 1)/2;
                }
            }
            System.out.println(sum);
        }
    }
}
