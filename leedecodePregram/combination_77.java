package leedecodePregram;

import java.util.ArrayList;
import java.util.List;

public class combination_77 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>>list=combine(n,k);
        System.out.print(list);
    }
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(n, 1, k, ans, new ArrayList < > ());
        return ans;
    }
    public static void findCombinations(int n,int val, int target, List < List <     Integer >> ans, List < Integer > ds) {

        if(target==0){
            ans.add(new ArrayList < > (ds));
            return;
        }
        if (n == 0) {
            return;
        }
        ds.add(val);
        findCombinations(n-1, val+1, target-1, ans, ds);
        ds.remove(ds.size() - 1);
        findCombinations(n-1, val+1, target, ans, ds);
    }
}
