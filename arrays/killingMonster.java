package arrays;

import java.util.Scanner;

public class killingMonster {
    public static long counter(long[] enemy, long ap[]) {
        long counter = 0;
        for (int j = 0; j < enemy.length - 1; j++) {
            if (enemy[j] <= ap[j]) {
                counter += enemy[j];
                ap[j] = ap[j] - enemy[j];
                if (enemy[j + 1] <= ap[j]) {
                    counter += enemy[j + 1];
                    enemy[j + 1] = 0;
                } else {
                    counter += ap[j];
                    enemy[j + 1] = enemy[j + 1] - ap[j];
                }
            } else {
                counter += ap[j];
                enemy[j] = enemy[j] - ap[j];
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//
        long[] SA = new long[N + 1];//
        long[] SB = new long[N];//
        for (int i = 0; i < N + 1; i++) {
            SA[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 0; i < N; i++) {
            SB[i] = Integer.parseInt(scanner.next());
        }
        System.out.println(counter(SA, SB));
        scanner.close();
    }
}
