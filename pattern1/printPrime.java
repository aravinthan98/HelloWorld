package pattern1;

public class printPrime {
    public static void main(String[] args) {
        int n=50,prime;
        for(int i=1;i<=n;i++){
            prime=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                     prime++;
                     break;
                }
            }
            if(prime==0){
                System.out.print(i+" ");
            }
        }
    }
}
