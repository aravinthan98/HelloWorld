package Newtonschool_assignment.Recursion;

public class palindrom {
    public static void main(String[] args) {
        String s="aabbaa";
        System.out.println(check_Palindrome(s,0,s.length()-1));
    }
    static boolean check_Palindrome(String str,int s, int e){

        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return check_Palindrome(str, s + 1, e - 1);

        return true;

    }
}
