package stack;

import java.util.Stack;

public class parentheses {
    public static void main(String[] args) {
        String s="(((({{{[[[]]]}[]}}()){})))";
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='{' || ch=='['){
                stack.add(ch);
            }
            else if(ch==')'){

                stack.pop();
            }
            else if (ch=='}') {

               stack.pop();
            }
            else if (ch==']') {
                stack.pop();
            }
        }
        if(stack.empty()){
            System.out.println("valid parenthese");
        }
        else {
            System.out.println("not a valid parenthese");
        }
    }
}
