package arrays;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int N=sc.nextInt();

        int count=A;
        while(N-->0){
            int sum=count;
            int m = 0;
            int n = 9;

            while(sum != 0){

                int r = sum % 10;
                if(r>m){
                    m=r;
                }
                if(r<n){
                    n=r;
                }

                sum = sum / 10;
            }


            count=count+(m*n);
        }


        System.out.print(count);
        // Your code here
    }
}

