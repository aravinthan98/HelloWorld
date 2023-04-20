package arrays;

import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] arr={4,5,2,10,8};
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){

            int index=i;
            while(arr[i]<=arr[index]&& index>0){
                index--;

            }

            if(arr[i]>arr[index]){
                stack.push(arr[index]);
            }
            else{
                stack.push(-1);
            }

        }
        int j=n-1;
        while (!stack.empty()){
            arr[j]=stack.pop();
            j--;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
