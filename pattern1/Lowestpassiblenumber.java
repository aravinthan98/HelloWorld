package pattern1;
import java.util.Scanner;

public class Lowestpassiblenumber {
    public static void main(String[] args) {

        int n = 5;
        int[] arr ={1,2,3,4,5};
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
        rotate(arr,n);
    }
    public static void rotate(int arr[],int n){

        int i=1;
        while(i<arr.length-1){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

            System.out.print(arr[i]+" ");
            i++;
        }


    }
}
