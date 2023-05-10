package leedecodePregram;

public class BestTimetoBuyandSellStockII_122 {
    public static void main(String[] args) {
        int[] arr={6,1,3,2,4,7};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        boolean flag=false;
        int n=prices.length;
        int res=0;
        int max=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
                max= Math.max(max,prices[i]-min);
            }
            else{
                flag=true;
                res+=max;//2
                min=prices[i];
                max=0;
            }
        }
        if(flag && max!=0){
            res +=max;
        }
        if(flag){
            return res;
        }
        return max;
    }
}
