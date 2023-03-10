

public class Array {
    public static void main(String[] args) {
        int N=134;
        String[] s={"zero","one","second","three","four","five","six","seven","eight","nine"};
        String str=Integer.toString(N);
        int len=str.length();


        for(int i=0;i<len;i++){
            System.out.print(s[i] +" ");
        }

    }
}
