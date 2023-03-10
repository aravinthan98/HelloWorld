package pattern1;

import java.util.Scanner;

public class mobilenumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)%2 !=0){
                continue;
            }
            else {
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
}
