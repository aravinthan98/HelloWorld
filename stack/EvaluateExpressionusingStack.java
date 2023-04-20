package stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpressionusingStack {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }

//        String[] str={"4","13","5","/","+"};


        Stack<Integer> stack1=new Stack<>();
        for(int i=0;i< str.length;i++){
            String s=str[i];


            if(isoperator(s)&&!stack1.empty()){
                int start=stack1.pop();
                int sec=stack1.pop();
                int sum=operatoradd(s,start,sec);
                stack1.push(sum);


            }
            else{

                int ans=Integer.parseInt(s);
                stack1.push(ans);
            }
        }
        System.out.print(stack1.pop());
    }


    public static boolean isoperator(String c){
        switch(c){
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
            case "^":
                return true;
        }
        return false;
    }
    public static int operatoradd(String ch,int f,int l){
        int ans=0;
        switch(ch){
            case "+":
                ans=l+f;
                break;
            case "-":
                ans=l-f;
                break;
            case "*":
                ans=l*f;
                break;
            case "/":
                ans=l/f;
                break;
            case "^":
                ans=l^f;
                break;

        }
        return ans;
    }
}
