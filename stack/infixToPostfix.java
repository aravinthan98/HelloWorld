package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String s="((A-(B/C))*((A/K)-L))";
        String ans=infixToPostFix(s);
        System.out.print(ans);
    }

    static int Prec(char ch)
    {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostFix(String exp)
    {
        // initializing empty String for result

        // initializing empty stack
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                sb.append(c);

            else if (c == '(')
                stack.push(c);


            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.peek());
                    stack.pop();
                }

                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty()
                        && Prec(c) <= Prec(stack.peek())) {

                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            }
        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {

            sb.append(stack.peek());
            stack.pop();
        }

        return sb.toString();
    }


}
