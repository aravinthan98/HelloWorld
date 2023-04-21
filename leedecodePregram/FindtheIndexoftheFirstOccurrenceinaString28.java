package leedecodePregram;
//Given two strings needle and haystack, return the index of the first
// occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class FindtheIndexoftheFirstOccurrenceinaString28 {
    public static void main(String[] args) {
        String h="sadbutsad";
        String n="sad";
        System.out.print(strStr(h,n));

    }
    public static int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
