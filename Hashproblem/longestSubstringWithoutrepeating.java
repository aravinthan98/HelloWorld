package Hashproblem;

import java.util.HashMap;
import java.util.Scanner;

public class longestSubstringWithoutrepeating {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=str.trim();

        int n=s.length();

        HashMap<Character, Integer> map=new HashMap<>();
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){

                if (map.containsKey(s.charAt(i))) {//abcadf
                    count = Math.max(count, map.get(s.charAt(i)) + 1);

                }

                map.put(s.charAt(i), i);
                max = Math.max(max, i - count + 1);

        }

        System.out.print(max);
        // Your code here
    }
}
