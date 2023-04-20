package arrayList;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class HashMapdup {
    static HashMap<Integer, Integer> findRepeating(int []arr, int size){

        HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();

        for(int i = 0; i < size; i++) {
            if(frequency.containsKey(arr[i])) {
                frequency.put(arr[i], frequency.get(arr[i]) + 1);
            }
            else {
                frequency.put(arr[i], 1);
            }
        }
        return frequency;
    }
    public static void main (String[] args){
        int[] arr={3,2,1,1,2};
        int n = arr.length;
//        countFreq(arr,n);

        HashMap<Integer,Integer> frequency = findRepeating(arr, n);

        for (Map.Entry<Integer,Integer> entry : frequency.entrySet())

                System.out.println(entry.getKey()+ " "+entry.getValue());
    }

    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }

        for (int i = 0; i < n; i++)
        {
            if (mp.get(arr[i]) != -1)
            {
                System.out.println(arr[i] + " " + mp.get(arr[i]));
                mp.put(arr[i], -1);
            }
        }
    }

}
