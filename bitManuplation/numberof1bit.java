package bitManuplation;

public class numberof1bit {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        int count=hammingWeight(n);
        System.out.print(count);

    }
    public static int hammingWeight(int n) {
        String s=""+n;
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
