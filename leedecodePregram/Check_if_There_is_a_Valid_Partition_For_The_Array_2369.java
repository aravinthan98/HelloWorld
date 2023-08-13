package leedecodePregram;

public class Check_if_There_is_a_Valid_Partition_For_The_Array_2369 {
    public static void main(String[] args) {
        int[] nums={4,4,4,5,6};
        System.out.print(validPartition(nums));
    }
    public static boolean validPartition(int[] nums) {
        Boolean[] arr=new Boolean[nums.length];

        return validPartitionhelper(nums,0,arr);
    }

    public static boolean validPartitionhelper(int[]arr,int i,Boolean[]dp){

        if(i==arr.length){
            return true;
        }

        if(dp[i]!=null){
            return dp[i];
        }
        if(i<arr.length-1&&arr[i+1]==arr[i]){
            if(validPartitionhelper(arr,i+2,dp)){
                return dp[i]=true;
            }

            if(i<arr.length-2&&arr[i+1]==arr[i+2]){
                if(validPartitionhelper(arr,i+3,dp)){
                    return dp[i]=true;
                }

            }

        }
        if(i<arr.length-2&&arr[i+1]==arr[i]+1&&arr[i+2]==arr[i]+2){
            if(validPartitionhelper(arr, i+3,dp)){
                return dp[i]=true;
            }

        }

        return dp[i]=false;
    }
}
