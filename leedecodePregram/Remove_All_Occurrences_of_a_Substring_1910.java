package leedecodePregram;

public class Remove_All_Occurrences_of_a_Substring_1910 {
    public static void main(String[] args) {
       String s = "daabcbaabcbc";
       String part = "abc";
       System.out.print(removeOccurrences(s,part));
    }
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);

        while (sb.indexOf(part)!=-1) {
            int start=sb.indexOf(part);
            sb.delete(start,start+part.length());
        }
        return sb.toString();
    }
}
