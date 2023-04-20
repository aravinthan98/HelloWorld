import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicatesele {
    public static void main(String[] args) {
        int[] arr={8,3,2,8,1,2,4,3,0,3};
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
           set.add(arr[i]);
        }

        System.out.print(set);
    }
}
