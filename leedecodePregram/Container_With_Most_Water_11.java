package leedecodePregram;

public class Container_With_Most_Water_11 {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       System.out.print(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        int water=0;
        while(left<=right){
            if(height[left]<=height[right]){
                int base=right-left;
                water=height[left]*base;
                max=Math.max(max,water);
                left++;
            }
            else{
                int base=right-left;
                water=height[right]*base;
                max=Math.max(max,water);
                right--;
            }
        }
        return max;

    }
}
