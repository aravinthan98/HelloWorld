package bitManuplation;

public class numberof1bit {
//    public static void main(String[] args) {
//        int n=00000000000000000000000000001011;
//        int count=hammingWeight(n);
//        System.out.print(count);
//
//    }
//    public static int hammingWeight(int n) {
//        String s=""+n;
//        int l=s.length();
//        int count=0;
//        for(int i=0;i<l;i++){
//            if(s.charAt(i)=='1'){
//                count++;
//            }
//        }
//        return count;
//    }
    public static void main(String[] args) {
        int n=10;
        int setbit=0;
//        while (n>0){   //big O(n setbits)
//            n=n &(n-1);
//            setbit++;
//        }
//        while(n>0){
//            setbit +=n%2;  //O(log n)
//        }
        System.out.print(setbit);
    }
}
