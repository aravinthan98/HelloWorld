package Newtonschool_assignment.ArrayList;

import java.util.*;

//There is a list, having n integers that may have duplicates, is given. Write a Java program to
// print all unique elements and their frequencies. Elements must be in sorted order.
//Sample Input:
//7
//1 2 4 3 5 4 3
//
//Sample Output:
//1 1
//2 1
//3 2
//4 2
//5 1
public class Count_frequencies {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        Set<Integer> uniqueSet = new HashSet<Integer>(list);

        for (Integer i : uniqueSet) {
            System.out.println(i + " " + Collections.frequency(list, i));
        }
        // Your code here
    }

}
