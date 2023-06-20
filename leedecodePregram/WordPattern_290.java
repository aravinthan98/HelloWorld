package leedecodePregram;

import java.util.HashMap;

public class WordPattern_290 {
    public static void main(String[] args) {
        String s="abba";
        String s1="dog dog cat cat";

        System.out.println(wordPattern(s,s1));
    }
    public  static boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> map=new HashMap<>();
        String[] ans=s.split(" ");
        if(pattern.length()!=ans.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=ans[i]){
                    return false;
                }
            }
            else{
                map.put(ch,ans[i]);
            }
        }

        return true;
    }
}
