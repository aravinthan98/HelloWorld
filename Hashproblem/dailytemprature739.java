package Hashproblem;

import util.com.util;

public class dailytemprature739 {
    public static void main(String[] args) {
        int[] arr={73,74,75,71,69,72,76,73};
        int[] narr=dailyTemperatures(arr);
        util.printArrays(narr);
    }
    public static int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] arr=new int[n];

        for(int i=0;i<n-1;i++){
            int count=0;

            if(temp[i]>=temp[i+1]){
                int j=i;
                while(j<n-1 && temp[i]>=temp[j]){
                    count++;
                    j++;
                }
                if(j<n && temp[i]<temp[j]){

                    arr[i]=count;
                }
            }
            else{
                count++;
                arr[i]=count;
            }
        }
        return arr;
    }
}
