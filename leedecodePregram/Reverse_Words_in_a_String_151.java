package leedecodePregram;

public class Reverse_Words_in_a_String_151 {
    public static void main(String[] args) {
        String s="i am the hero";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder stb = new StringBuilder();

        int count=0;
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if (ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
                sb.append(ch);
                count++;
            } else {
                if (count != 0) {
                    stb.append(sb.reverse().toString()+" ");
                    sb.setLength(0);
                    count=0;
                }
            }
        }
        if(sb.length()!=0){
            stb.append(sb.reverse().toString());
        }

        return stb.toString().trim();

    }
}
