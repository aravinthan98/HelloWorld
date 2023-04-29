package leedecodePregram;

public class SumofTwoIntegerswithoutoperator371 {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(getSum(a,b));
    }
    public static int getSum(int a, int b) {
        int ans=a;
        while(b!=0){
            int res=a&b;
            a^=b;
            b=res<<1;
        }
        return a;

    }
}
