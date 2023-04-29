package leedecodePregram;

import java.util.HashMap;

public class NumberofGoodPairs_1512 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count=count+map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return count;
    }
}
