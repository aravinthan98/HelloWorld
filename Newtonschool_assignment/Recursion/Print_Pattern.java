package Newtonschool_assignment.Recursion;
//Print a sequence of numbers starting with N, without using loop, in which A[i+1] = A[i] - 5, if A[i]>0, else A[i+1] = A[i] + 5 repeat it until A[i]=N.
//
//Note:- Once you change a operation you need to continue doing it.
//Since this will be a functional problem, you don't have to take input. You just have to
// complete the function PrintPattern() that takes the integer N and the integer curr (curr = N) and bool flag (flag = true) as a parameter.
public class Print_Pattern{
    public static void main(String[] args) {
        int n=16;
        int cur=16;
        printPattern(16,16,true);
    }
    static void printPattern(int n,int curr, boolean flag){
        System.out.print(curr+" ");

        if(flag==false&&n==curr){
            return;
        }

        if(flag==true){
            if(curr-5>0){
                printPattern(n,curr-5,true);
            }
            else{
                printPattern(n,curr-5,false);
            }
        }
        else{
            printPattern(n,curr+5,false);
        }

    }
}
