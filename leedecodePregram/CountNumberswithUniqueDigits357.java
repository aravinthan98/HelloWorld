package leedecodePregram;

public class CountNumberswithUniqueDigits357 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int sum=10;
        int uniqnum=9;
        for(int counter=9; counter>0 && n>1;n--,counter--){
            uniqnum *=counter;
            sum +=uniqnum;
        }

        return sum;
    }
}
