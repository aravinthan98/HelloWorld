package bitManuplation;

public class numberIsPowerOf2 {
    public static void main(String[] args) {
        int n=4;
        System.out.print(Ispowerof2(n));
    }
     public static boolean Ispowerof2(int n){
        if(n==0){
            return false;
        }
        int ans=n&(n-1);
        return ans== 0;

    }
}
