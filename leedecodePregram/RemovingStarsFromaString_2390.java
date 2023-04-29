package leedecodePregram;

public class RemovingStarsFromaString_2390 {
    public static void main(String[] args) {
        String s="leed**cod*e*";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
