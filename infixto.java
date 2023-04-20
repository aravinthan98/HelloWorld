import java.util.Scanner;
import java.util.Stack;

public class infixto {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        String str="21+3*";
//        for(int i=0;i<n;i++){
//            str=str+sc.next();
//        }

        int infix=prifixtoinfix(str);


        System.out.println(infix);
    }
    public static int prifixtoinfix(String s){
        int n=s.length();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(isoperator(c)){
                String first=stack.pop();
                String next=stack.pop();
                String comb="("+first+c+next+")";
                stack.push(comb);
            }
            else{
                stack.push(c+ "");
            }
        }

        String ans= stack.pop();
        int conv=Integer.valueOf(ans);
        return conv;

    }
    public static boolean isoperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '^':
                return true;
        }
        return false;
    }
}
