package Hashproblem;

import java.util.HashMap;
import java.util.Scanner;

public class Themajorcharacter11 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>map=new HashMap<>();

        int n=sc.nextInt();
        String s=sc.next();

        int max1=0;
        int l=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);

                if(map.get(ch)>=max1){
                    max1=map.get(ch);
                    l=i;
                }
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.print(l);
        // Your code here
    }
}
