package arrayList;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){

        }
        Arrays.sort(arr);


        for(int i=0;i<n;i++){
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }


    }
}
