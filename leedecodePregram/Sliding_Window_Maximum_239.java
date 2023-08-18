package leedecodePregram;

import java.util.ArrayDeque;
import java.util.Deque;
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
public class Sliding_Window_Maximum_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] arr=maxSlidingWindow(nums,k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] narr=new int[nums.length-(k-1)];
        Deque<Integer> queue=new ArrayDeque<>();
        int itr=0;
        for(int i=0;i<nums.length;i++){

            if(!queue.isEmpty()&&queue.peek()==i-k){
                queue.poll();
            }
            while(!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i>=k-1){
                narr[itr++]=nums[queue.peek()];
            }

        }
        return narr;
    }
}
