package leedecodePregram;

import util.com.util;

//input-[1,2,3]
//output--[1,2,4]
public class PlusOne_66 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,4,3,8,9,9};
        int[] narr=plusOne(arr);
        util.printArrays(narr);
    }
    public static int[] plusOne(int[] digits) {
        int cary=0;
        boolean flag=false;
        StringBuilder sb=new StringBuilder();

        if(digits[digits.length-1]==9){
            flag=true;
            boolean val=false;
            for(int i=digits.length-1;i>=0;i--){
                if(!val&&digits[i]==9){
                    sb.append(0);
                    cary=1;
                }
                else{
                    sb.append(digits[i]+cary);
                    cary=0;
                    val=true;
                }
            }
            if(cary!=0){
                sb.append(cary);
            }
        }
        else{
            digits[digits.length-1]= digits[digits.length-1]+1;
        }

        if(flag){
            String str=sb.reverse().toString();
            int[] arr=new int[str.length()];
            for(int i=0;i<str.length();i++){
                int temp=str.charAt(i)-'0';
                arr[i]=temp;
            }
            return arr;
        }
        return digits;
    }
}
