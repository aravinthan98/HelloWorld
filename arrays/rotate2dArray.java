package arrays;
import java.util.Scanner;
public class rotate2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=2;
        int n=2;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        transpose(arr,m,n);
        rotate1(arr,m,n);
        System.out.println();
        rotate2(arr,m,n);

    }
    public static void print(int[][] arr,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }
    public static void rotate1(int[][] arr,int m,int n){
        for(int i=0;i<m;i++){
            int p1=0;
            int p2=n-1;
            while(p1<=p2){
                int temp=arr[i][p1];
                arr[i][p1]=arr[i][p2];
                arr[i][p2]=temp;
                p1++;
                p2--;
            }
        }
        print(arr,m,n);
    }
    public static void rotate2(int[][] arr,int m,int n){
        transpose(arr,m,n);
        rotate1(arr,m,n);

    }
}
