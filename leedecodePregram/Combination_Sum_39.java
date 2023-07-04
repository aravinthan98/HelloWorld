package leedecodePregram;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>plist=new ArrayList<>();

        combination(plist,target,candidates,new ArrayList<>(),0);

        return plist;
    }
    public static void combination(List<List<Integer>>plist,int sum,int[] arr,List<Integer>clist,int index ) {

        if(sum==0){
            plist.add(new ArrayList<>(clist));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(sum-arr[i]>=0){
                clist.add(arr[i]);
                combination(plist,sum-arr[i],arr,clist,i);
                clist.remove(clist.size()-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int target = 8;

        List <List< Integer >> ls = combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

