package leedecodePregram.dynamic_programming;

import java.util.Arrays;

public class Minimum_ASCII_Delete_Sum_for_Two_Strings_712 {
    public static void main(String[] args) {
        String s1="delete";
        String s2="leet";
        System.out.print(minimumDeleteSum(s1,s2));
    }
//    public static int minimumDeleteSum(String s1, String s2) {
//        int[][] dp=new int[s1.length()+1][s2.length()+1];
//        for(int i=0;i<=s1.length();i++){
//            Arrays.fill(dp[i],-1);
//        }
//        int s1sum=totalSum(s1);
//        int s2sum=totalSum(s2);
//        return (s1sum+s2sum)-2* sameElementSum(s1,s2,s1.length(),s2.length(),dp);
//    }
//    public static int totalSum(String s){
//        int sum=0;
//        for(int i=0;i<s.length();i++){
//            sum+=(int)s.charAt(i);
//        }
//        return sum;
//    }
//    public static int sameElementSum(String s1,String s2,int i,int j,int[][] dp){
//        if(i==0||j==0){
//            return 0;
//        }
//
//        if(dp[i][j]!=-1){
//            return dp[i][j];
//        }
//        if(s1.charAt(i-1)==s2.charAt(j-1)){
//            dp[i][j]= sameElementSum(s1,s2,i-1,j-1,dp)+(int)s1.charAt(i-1);
//            return dp[i][j];
//        }
//        dp[i][j]= Math.max(sameElementSum(s1,s2,i-1,j,dp),   sameElementSum(s1,s2,i,j-1,dp));
//        return dp[i][j];
//    }



    // -----------------Another method------------
    public static int minimumDeleteSum(String s1, String s2) {

        int s1sum=0;
        for(int i=0;i<s1.length();i++){
            s1sum+=(int)s1.charAt(i);
        }
        int s2sum=0;
        for(int i=0;i<s2.length();i++){
            s2sum+=(int)s2.charAt(i);
        }
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        int max=0;
        for(int i=1;i<=s1.length();i++){
            for (int j = 1; j <=s2.length(); j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]= (int)s1.charAt(i-1)+dp[i-1][j-1];

                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);;
                }
            }
        }
        return (s1sum+s2sum)-2*dp[s1.length()][s2.length()];
    }

}
