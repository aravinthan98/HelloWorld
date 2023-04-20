package arrays;

import java.util.Scanner;

public class nextlargerElement {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
        int n=4;
        long[] arr={1,2,3,4};
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextLong();
//        }


        for(int i=0;i<n;i++){

            int index=i;
            while(arr[i]>=arr[index]&& index<n-1){
                index++;

            }

            if(arr[i]<arr[index]){
                arr[i]=arr[index];
            }
            else{
                arr[i]=-1;
            }

        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
