package arrays;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {


        String str = "aeroplane";
        System.out.println(printOdd(str));
    }
    public static String printOdd(String str) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
