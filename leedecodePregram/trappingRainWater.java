package leedecodePregram;
//Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.
public class trappingRainWater {
    public static void main(String[] args) {
       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(trap(height));
    }
    public static int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){  //1 0 0 1
                    leftmax=height[left];
                }
                else{
                    water +=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    water +=rightmax-height[right];
                }
                right--;
            }
        }
        return water;

    }
}
