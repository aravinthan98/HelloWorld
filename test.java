import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        boolean value = false;
        int[] arr = {1, 2, 4, 6, 4, 6, 6};

        int n = arr.length;
        TwoNumber(n,arr);
    }
    public static void TwoNumber(int n,int []arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.print(map);
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        System.out.print(list);
    }

}
