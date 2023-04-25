package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeArraylist {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            list1.add(sc.nextInt());
        }
        int ind = sc.nextInt();

            list.addAll(ind,list1);// 1 2 3 4 5 6=1 3 4 5 67 2 3 4 5 6

        for (int i=0;i<list.size();i++){

                System.out.print(list.get(i));
        }
    }
}
