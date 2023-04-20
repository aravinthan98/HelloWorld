package arrays;

import java.util.ArrayList;
import java.util.Arrays;
//You are given an array A of size N. You need to find the integer not present in this array that is closest to K. The closeness between two numbers A[i] and A[j] is defined as abs(A[i] - A[j]).
//
//For Example:
//For given array A = [1,2,5,6,13]
//For given K = 12
//Output: 12
//
//Explanation: numbers missing 3, 4, 7,8, 9, 10, 11, 12, 14, 15....
//and K = 12, so distance from each missing number is (3,9), (4,8), ....
//where every pair denotes (missing number, distance) hence 12 is answer.
public class tooCloseTothetarget {
    public static void main(String[] args) {
        int[] arr = {4, 7, 10, 6, 5};
        int n = 5;
        int x=10;
        ArrayList<Integer>list=new ArrayList<>();
        int max=0;
        for (int i = 0; i <n ; i++) {
            list.add(arr[i]);
            max=Math.max(max,arr[i]);
        }

        int l=1;
        int ans=0;
        if(list.contains(x)){
            while (l<max){
                if(!list.contains(x-l)&&l<x){
                    ans=x-l;
                    break;
                }
                if(!list.contains(x+l)&&x+l<=max){
                    ans=x+l;
                    break;
                }

                l++;
            }
        }
        else {
            ans=x;
        }

        System.out.println(ans);
    }


}
