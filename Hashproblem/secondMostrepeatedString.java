package Hashproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class secondMostrepeatedString {
    public static void main (String[] args) {
        // Your code here
//        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        int n=7;
        String[] str={"aaa","aaa","aaa","bbb", "bbb", "bbb" ,"ccc"};
//        for(int i=0;i<n;i++){
//            str[i]=sc.next();
//        }
        int max=0;
        int max1=0;
        for(int i=0;i<n;i++){
            String s=str[i];
            map.put(s,map.getOrDefault(s,1)+1);
            max=Math.max(max,map.get(s));

        }

        String ans="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            int res=entry.getValue();

            if(res>=max1&&res<max){
                max1=res;
                ans=""+entry.getKey();
            }

        }

        System.out.print(ans);

    }
}
