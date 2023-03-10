package pattern1;

import java.util.Scanner;

public class romanLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        int num=0;
        String s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;

                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;

            }
            if (count>num*4){
                count -= num;
            }
            else{
                count +=num;
            }

        }
        System.out.print(count);


    }
}
