package string;

import util.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class riverseString {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest ";
        String ans=reverseWords(s);
        System.out.print(ans);
        String[] est={"ccc","aaa","ddd","bbb"};
        Arrays.sort(est);
        for(int i=0;i<est.length;i++){
            System.out.print(est[i]+" ");
        }

    }
    public static String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!=' ') {
                st.push(s.charAt(i));
            } else {
                while(!st.empty()){
                    sb.append(st.pop());
                }
                sb.append(" ");
            }
            i++;
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }

}
