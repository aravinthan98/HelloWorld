package Newtonschool_assignment.Recursion;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(Multiply(2,3));
    }
    static int Multiply(int M, int N) {
        if(N==0){
            return 0;
        }

        return M+Multiply(M,N-1);
    }
}
