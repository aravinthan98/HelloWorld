package arrayList;

import java.util.ArrayList;

public class removedup {
    public static void removeDuplicates(int[] nums) {
        ArrayList<Character>list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//            }
//
//        }
//        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            nums[i]=list.get(i);
//
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.print(nums[i]+" ");
//
//
//        }

        String s="carrata";

        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));

        }
        if(list.contains('a')){
            System.out.println(list.indexOf('a'));
        }

        System.out.print(list);



    }

    public static void main(String[] args) {
        int[] arr={1,2,2};
         removeDuplicates(arr);

    }
}
