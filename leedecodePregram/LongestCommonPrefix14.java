package leedecodePregram;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs={"flower","floringe","florida"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int val=strs[i].indexOf(prefix);
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;

    }
}