package recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long n=sc.nextLong();
        System.out.print(powerf(a,n));

    }
    public static long powerf(long a,long n){
        long m=1000000007;
        if(n==0){
            return 1;
        }
        long ans=1;
        for(int i=1;i<=n;i++) {
             ans = ( ans*a) % m;
        }
        return ans;

    }
}
