package arrays;

import java.util.ArrayList;

public class rotateArraykTimes {
    public static void main(String[] args) {
       //[1,2,3,4,5,6,7], k = 3
       int[] arr={1,2,3,5,6,7};//7 1 2 3 5 6, 6 7 1 2 3 5, 5 6 7 1 2 3
       int k=3;

       int n=arr.length;
//       rotatearray(arr,n,k);
        rotatearraylist(arr,n,k);

    }
//    public static void rotatearray(int[] arr,int n,int k){
//        int[] arr1=new int[n];// 1 2 3 4 5,k=3;   output= 3 4 5 1 2
//
//        for(int i=0;i<n;i++){
//            if(i<k){
//                arr1[i]=arr[n+i-k];
//
//            }
//            else{
//                arr1[i]=arr[i-k];
//            }
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr1[i]+" ");
//        }
//
//
//    }
    public static void rotatearraylist(int[] arr,int n,int k ){
        ArrayList<Integer>list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<k;i++){  //7 1 2 3 5 6
            list.add(0,arr[n-1-i]);
            list.remove(n);
        }
        System.out.print(list);
    }
}
