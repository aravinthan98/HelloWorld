package leedecodePregram;

import java.util.Stack;

public class decodeString394 {
    public static void main(String[] args) {
        String s="3[a]2[bc]";//output-aaabcbc
        System.out.print(decodeString(s));
    }
    public static String decodeString(String s) {

        int len=s.length();
        Stack<String> stack=new Stack<>();
        boolean flag=false;
        int count=0;
        String num="";
        for(int i=len-1;i>=0;i--){
            String ch=""+s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                flag=true;
                count++;
                num=ch+num;
            }
            else{
                if(count !=0){
                    int n=Integer.parseInt(num);
                    String con="";
                    for(int j=0;j<n;j++){
                        con=con+stack.peek();
                    }
                    stack.pop();
                    stack.push(con);
                }
                flag=false;
                count=0;
                num="";
            }
            if(Character.isAlphabetic(s.charAt(i))){
                stack.push(ch);
            }
            else if(s.charAt(i)==']'){
                stack.push(ch);
            }
            else if(s.charAt(i)=='['){
                String str="";
                while(!stack.empty() && !stack.peek().equals("]")){
                    str=str+stack.pop();
                }
                stack.pop();
                stack.push(str);


            }


        }
        if(flag){
            int n=Integer.parseInt(num);
            String con="";
            for(int j=0;j<n;j++){
                con=con+stack.peek();
            }
            stack.pop();
            stack.push(con);
        }
        String ans="";
        while(!stack.empty()){
            ans=ans+stack.pop();
        }
        return ans;
    }
}
