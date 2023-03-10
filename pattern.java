import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
/*        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        original=sc.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);

        if(original.equals(reverse))
            System.out.print("True");

        else
            System.out.print("False");
*/

        int sum=0;
        int r=0;
        int n=454;
        int temp=n;
        while(n>0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp==sum)
            System.out.println("True");

        else
            System.out.println("False");

    }
}
