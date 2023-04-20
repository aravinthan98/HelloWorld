package leedecodePregram;

public class findAnumerIsSumOfconsecutivenumber {
    public static void main(String[] args) {
        boolean value=false;
        int n=9;
        int sum=0;
        int l=1;
        for(int i=0;i<(n/2)+1;i++){
            sum+=i;
            if(sum==n){
                value=true;
                break;

            } else if (sum>n) {
                while(sum>n) {
                    sum = sum - l;
                    l++;
                }
                if(sum==n){
                    value=true;
                    break;
                }
            }


        }
        if(value){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
