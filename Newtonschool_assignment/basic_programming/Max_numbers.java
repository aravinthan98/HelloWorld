package Newtonschool_assignment.basic_programming;

import java.util.Scanner;

//Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
//Try solving it in O(N) per test case
public class Max_numbers {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int max3=Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num>=max1){
                    max3=max2;
                    max2=max1;
                    max1=num;

                }
                else if(num>=max2){
                    max3=max2;
                    max2=num;
                }
                else if(num>=max3){
                    max3=num;
                }
            }
            System.out.println(max1+" "+max2+" "+max3);


        }
        // Your code here
    }

}
