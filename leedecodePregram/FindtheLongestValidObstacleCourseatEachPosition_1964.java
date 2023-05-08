package leedecodePregram;

import util.com.util;

import java.util.HashMap;
import java.util.Stack;

public class FindtheLongestValidObstacleCourseatEachPosition_1964 {
    public static void main(String[] args) {
        int[] arr={2,2,1};//{5,1,5,5,1,3,4,5,1,4};
        arr=longestObstacleCourseAtEachPosition(arr);
        util.printArrays(arr);
    }
    public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n=obstacles.length;
        int[] arr=new int[n];
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        int d=0;
        for(int i=0;i<n;i++){
            int max=0;
            while(!stack.empty()&&stack.peek()>obstacles[i]){
                stack.pop();
            }
            stack.push(obstacles[i]);
            if(map.containsKey(obstacles[i])){
                map.put(obstacles[i],map.get(obstacles[i])+1);
               d=map.get(obstacles[i]);
            }
            else{
                map.put(obstacles[i],stack.size());
                d=map.get(obstacles[i]);
            }
            max=Math.max(d,stack.size());
            arr[i]=max;
        }
        return arr;
    }
}
