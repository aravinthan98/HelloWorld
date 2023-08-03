package leedecodePregram.dynamic_programming;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase
// letters and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
public class Valid_Palindrome_125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
    }
    public boolean isPalindrome(String s) {
        if(s.length()<2){
            return true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9'){
                if(ch>='A'&&ch<='Z'){
                    int asci=ch+32;
                    ch=(char)asci;
                }
                sb.append(ch);
            }

        }
        String s1=sb.toString();
        String s2=sb.reverse().toString();

        return s1.equals(s2);

    }
}
