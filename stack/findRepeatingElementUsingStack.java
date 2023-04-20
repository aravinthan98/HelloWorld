package stack;

import java.util.Stack;

public class findRepeatingElementUsingStack {
    public static void main(String[] args) {
        String s="I’m a Java developer";
        int n=s.length();
        String[] arr=new String[n];
        Stack<Character>stack=new Stack<>();
        Stack<Character>stack1=new Stack<>();

        for(int i=0;i<n;i++){
            if(Character.isAlphabetic(s.charAt(i))){
               stack.push(s.charAt(i));

            }
        }
        while (!stack.empty()) {
            boolean value=false;  // abad
            char ch=stack.pop();
            while (!stack.empty()){
                if(ch==stack.peek()){
                    value=true;
                    stack.pop();
                }
                else {
                    stack1.push(stack.pop());
                }
            }
            if(value){
                System.out.print(ch);
            }
            while (!stack1.empty()){
                stack.push(stack1.pop());
            }
        }

    }
}
