package Newtonschool_assignment;

import java.util.Scanner;

public class happyDiwali {

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=1;
            int max=0;

            for(int i=1;i<=n;i++){

                if(max <= (arr[i] + k - 1)/k){

                    max = (arr[i] + k - 1)/k;

                    ans = i;

                }
            }
            System.out.println(ans);

        }

}
