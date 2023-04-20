package arrays;

public class jumelement {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.print(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        boolean value=false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=i+nums[i];
            if(max>=n-1){
                value= true;
                break;
            }
        }
        return value;


    }

}

