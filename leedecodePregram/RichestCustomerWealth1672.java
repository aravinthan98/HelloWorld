package leedecodePregram;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;

        int i=0;
        while(i!=accounts.length){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }
            max=Math.max(max,sum);
            i++;
        }
        return max;
    }
}
