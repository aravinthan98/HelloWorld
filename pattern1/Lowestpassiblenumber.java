package pattern1;
import java.util.Scanner;

public class Lowestpassiblenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        rotate(arr,n);
    }
    public static void rotate(int arr[],int n){

        int i=1;
        int temp=arr[0];
        arr[arr.length-1]=temp;

        while(i<arr.length-1){
            arr[i]=arr[i-1];
            temp=arr[i];
            arr[i+1]=temp;
            System.out.print(arr[i]+" ");
            i++;
        }


    }
}
