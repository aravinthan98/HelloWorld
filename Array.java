

public class Array {
    public static void main(String[] args) {
        int N=0;

        String[] s={"zero","one","second","three","four","five","six","seven","eight","nine"};
        String str=""+N;
        int len=str.length();
//        int[] a=new int[10];
//        int r=0;
//
//        while(N>0){
//            r=N%10;
//            a[0]=r;
//            N=N/10;
//        }

        for(char c:str.toCharArray()){
            int n=c-'0';
            System.out.print(s[n] +" ");
        }

    }


}
