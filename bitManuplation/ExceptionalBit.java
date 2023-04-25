package bitManuplation;

import java.util.Scanner;

public class ExceptionalBit {
    public static void main (String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int t=4;
//    while(t !=0){

        long l=1;
        long r=10;
        long k=3;
        long value=0;
        for(long i=l;i<=r;i++){
            long setbit=0;

            String str=Long.toBinaryString(i);
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(ch=='1'){
                    setbit++;
                }
            }

            if(setbit==k){
                value=l;
                break;
            }
        }
        if(value==0){
            System.out.println(-1);
        }
        else{
            System.out.println(value);
        }
//        t--;
//    }
    // Your code here
    }
}
