package leedecodePregram;
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
// of the integer. The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
public class PlusOne {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] nums=plusOne(arr);
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        int ans=Integer.parseInt(sb.toString());
        ans=ans+1;
        String str=""+ans;
        for(int i=0;i<str.length();i++){
           int temp=str.charAt(i)-'0';
            digits[i]=temp;
        }
        return digits;
    }
}
