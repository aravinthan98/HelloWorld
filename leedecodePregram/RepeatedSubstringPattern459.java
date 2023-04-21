package leedecodePregram;

public class RepeatedSubstringPattern459 {
    public static void main(String[] args) {
            String s="aba";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        sb1.append(s);
        int index=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            sb.append(ch);
            sb1.delete(0,1);

            if(!sb1.toString().contains(sb)){
                index=i;
                break;
            }
        }
        sb.delete(index,index+1);
        String s1=sb.toString();
        if(s.indexOf(s1)==0){
            return true;
        }
        return false;
    }
}
