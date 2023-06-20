package leedecodePregram;

import util.com.util;

import java.util.HashMap;
import java.util.Stack;

public class FindtheLongestValidObstacleCourseatEachPosition_1964 {
    public static void main(String[] args) {
        int[] arr={5,1,5,5,1,3,4,5,1,4};//{1,2,3,2};//{3,1,5,6,4,2};
        arr=longestObstacleCourseAtEachPosition(arr);
        util.printArrays(arr);
    }
    public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] largestObstacleLength = new int[n];
        int[] minHeightStack = new int[n];
        int j = -1;

        for(int i=0;i<n;i++){

            if(j==-1 || (obstacles[i] >= minHeightStack[j])){
                minHeightStack[++j] = obstacles[i];
                largestObstacleLength[i] = j+1;
            }else{
                int left = 0, right = j;
                while(left<right){
                    int mid = left+(right-left)/2;
                    if(minHeightStack[mid]<=obstacles[i]){
                        left = mid+1;
                    }else{
                        right = mid;
                    }
                }
                minHeightStack[right] = obstacles[i];
                largestObstacleLength[i] = right+1;
            }

        }

        return largestObstacleLength;
    }
}
