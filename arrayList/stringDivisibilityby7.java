package arrayList;

public class stringDivisibilityby7 {
    public static void main(String[] args) {
        String s="10000062";

        int n=s.length();
        int i=0;
        int j=0;

        while (i<n) {
            int k= (s.charAt(i)-'0')+j;
            if(k==0) {
                j=k;
            }
            else if((k>1)&&(k<7)){
                if(i==n-1){
                    j =(k % 7)  * 10;
                }
                else {
                    k = k * 10 + (s.charAt(i + 1) - '0');

                    j = (k % 7) * 10;
                    i++;
                }
            }
            else {
                j =(k % 7)  * 10;
            }
            i++;
        }
        System.out.print(j);
    }
}
