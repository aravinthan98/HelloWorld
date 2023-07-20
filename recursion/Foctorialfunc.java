package recursion;

public class Foctorialfunc {
    public static void main(String[] args) {
        int n=5;
        System.out.println(foctorial(n));
    }
    public static int foctorial(int n){
        if(n==1){
            return 1;
        }
        return n*foctorial(n-1);
    }
}
