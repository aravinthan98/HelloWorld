

public class Array {
    public static void main(String[] args) {
        int N=134;
        String[] s={"zero","one","second","three","four","five","six","seven","eight","nine"};
        String str=""+N;
        int len=str.length();
        int[] a=new int[10];
        int r=0;

        while(N>0){
            r=N%10;
            a[0]=r;
            N=N/10;
        }

        for(int i=len-1;i>=0;i++){
            System.out.print(s[a[i]] +" ");
        }

    }


}
