package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mockprob1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list1=new ArrayList<>();

        
        for(int i=0;i<n;i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);

            }
        }
        for (int i = 0; i <n ; i++) {


                list1.add(arr[i]);

        }
        int max=Integer.MIN_VALUE;
        int freq=0;
        for(Integer i:list){
            if(list1.contains(i)){
                int coll=Collections.frequency(list1,i);
                System.out.println(i+" "+coll);
            }

        }

    }
}
