package leedecodePregram;

public class Kth_Largest_Element_in_an_Array_215 {
    public static void main(String[] args) {
        int[] nums={1,35,6,3,-4,5,5,7};
        int k=5;
        System.out.print(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        int max=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int[] newarr=new int[max+1];//3
        int[] newarr1=new int[(-min)+1];//2

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                newarr[nums[i]]++;
            }
            else{
                newarr1[-nums[i]]++;// 0 1
            }
        }
        int count=0;
        int ans=0;
        boolean flag=false;
        for(int i=max;i>=0;i--){
            if(newarr[i]!=0){
                count+=newarr[i];
                if(count>=k){
                    flag=true;
                    ans=i;
                    break;
                }
            }
        }
        if(flag){
            return ans;
        }
        for(int i=1;i<newarr1.length;i++){
            if(newarr1[i]!=0){
                count+=newarr1[i];
                if(count>=k){
                    ans=-(i);
                    break;
                }

            }
        }
        return ans;

    }
}
