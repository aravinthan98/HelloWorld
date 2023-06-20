package Hashproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashSetproblem {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,4,3,5,6,4};

        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int itr=0;
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
//           map.put(key,map.getOrDefault(key,0)+1);
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
                if(max<map.get(key)){
                    max=map.get(key);
                    itr=i;

                }
            }

        }
//        for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

//        System.out.println(map);

//        for(Integer i:map.keySet()){
//            if(map.get(i)==max) {
//                System.out.println(i);
//            }
//        }
        System.out.print(arr[itr]+" "+max);
    }
}
