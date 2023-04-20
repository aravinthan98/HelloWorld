package stack;

import java.util.Scanner;

public class greaterisBetter {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int n=5;
        int[] arr={5,4,1,3,2};

        int[] res=new int[n];
        for(int i=0;i<n;i++){

            int x=i-1;
            while(x>=0 && arr[i]>=arr[x]){
                if(arr[i]<arr[x]){
                    break;
                }
                x--;


            }
            int y=i+1;
            while(y<n&&arr[i]>=arr[y]){
                if(arr[i]<arr[y]){
                    break;
                }
                y++;

            }
            if(x!=-1){
                x=x+1;
            }
            if(y!=n){
                y=y+1;
            }
            else {
                y=-1;
            }
            int ans=x+y;
            res[i]=ans;
            System.out.print(ans+" ");


        }       // Your code here
    }
}

