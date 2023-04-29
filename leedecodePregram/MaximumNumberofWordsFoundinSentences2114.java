package leedecodePregram;

public class MaximumNumberofWordsFoundinSentences2114 {
    public static void main(String[] args) {
        String[] str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(str);
    }
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] arr=sentences[i].split(" ");
            max=Math.max(max,arr.length);
        }
        return max;
    }
}
