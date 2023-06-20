package leedecodePregram;

public class RotateString_796 {
    public static void main(String[] args) {
        String s="abcdg";
        String str="abcde";
        System.out.println(rotateString(s,str));
    }
    public static boolean rotateString(String s, String goal) {

            return s.length()==goal.length()&&(s+s).contains(goal);

    }
}
