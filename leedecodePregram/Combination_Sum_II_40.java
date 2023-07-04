package leedecodePregram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_40 {
    public static List<List<Integer>> combinationSumII(int[] candidates, int target) {
        List<List<Integer>>plist=new ArrayList<>();
        Arrays.sort(candidates);
        combination(plist,target,candidates,new ArrayList<>(),0);

        return plist;
    }
    public static void combination(List<List<Integer>>plist,int sum,int[] arr,List<Integer>clist,int index ) {

        if(sum==0){
            plist.add(new ArrayList<>(clist));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > sum) break;
                clist.add(arr[i]);
                combination(plist,sum-arr[i],arr,clist,i+1);
                clist.remove(clist.size()-1);

        }

    }
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;

        List <List< Integer >> ls = combinationSumII(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
