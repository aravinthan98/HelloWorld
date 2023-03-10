package arrays;

import java.util.Scanner;

public class lowestPassibleNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();

        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(count<n) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    count = count + 1;
                } else {
                    System.out.print(s.charAt(i)+"");
                }
            }
            else{
                System.out.print(s.charAt(i)+"");
            }
        }
    }
}
