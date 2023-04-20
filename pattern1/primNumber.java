package pattern1;

public class primNumber {
    public static void main(String[] args) {
        boolean isprime=true;
        int n = 13;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        System.out.print(isprime);
    }

}
