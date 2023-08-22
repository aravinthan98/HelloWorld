package leedecodePregram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Word_Break_139 {
    public static void main(String[] args) {
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        String s="catsandog";

        System.out.println(wordBreak(s,wordDict));
    }
    static HashMap<String,Boolean> map=new HashMap<>();
    public static boolean wordBreak(String s, List<String> wordDict) {

        if(wordDict.contains(s)){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        for(int i=1;i<s.length();i++){
            String str=s.substring(0,i);
            if(wordDict.contains(str)){
                if(wordBreak(s.substring(i),wordDict)){
                    map.put(s,true);
                    return true;
                }
            }

        }
        map.put(s,false);
        return false;
    }
}
