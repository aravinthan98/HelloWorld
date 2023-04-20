package Hashproblem;

import java.util.HashMap;
import java.util.Scanner;
//You are given a string S of length N. Find the character which occurs the most number of times in this string.
// If there are mutliple such characters present, print -1.
public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        String s=sc.next();
        int max=0;
        int max1=0;
        int k=0;
        int l=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)>max){
                    max=map.get(ch);
                    k=i;
                }
                if(map.get(ch)>=max1){
                    max1=map.get(ch);
                    l=i;
                }
            }
            else{
                map.put(ch,1);
            }
        }

        if(max1==max){
            if(k!=l){
                System.out.print(-1);
            }
            else{
                System.out.print(s.charAt(k));
            }

        }
    }
}
