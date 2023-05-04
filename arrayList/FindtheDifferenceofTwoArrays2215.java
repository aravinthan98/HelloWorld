package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindtheDifferenceofTwoArrays2215 {
    public static void main(String[] args) {

        int[] nums1={1,2,3,3};
        int[] nums2={1,1,2,2};

        List<List<Integer>>answer=new ArrayList<>();
        HashSet<Integer> list1=new HashSet<>();
        HashSet<Integer>list2=new HashSet<>();

        for(int i = 0; i<nums1.length; i++){
                list1.add(nums1[i]);
        }
        for(int j = 0; j<nums2.length; j++){
                list2.add(nums2[j]);

        }
        for(int i : nums1){
            if(list2.contains(i)){
                list2.remove(i);
                list1.remove(i);
            }
        }
        answer.add(new ArrayList<>(list1));
        answer.add(new ArrayList<>(list2));

        System.out.println(answer);
    }
}
