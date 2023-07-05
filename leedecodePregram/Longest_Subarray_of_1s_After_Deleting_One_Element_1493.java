package leedecodePregram;

public class Longest_Subarray_of_1s_After_Deleting_One_Element_1493 {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int prev=-1;
        int init=-1;
        int max=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flag=true;
                prev=init;
                init=i;
            }
            if(max<(i-prev)-1){
                max=(i-prev)-1;
            }
        }
        if(!flag){
            return nums.length-1;
        }
        return max;
    }
}
