package leedecodePregram;

public class DetectCapital_520 {
    public void main(String[] args) {
        String s="Flog";
        System.out.println(detectCapitalUse(s));
    }
    public boolean detectCapitalUse(String word) {
        int cap=0,small=0;

        for(int i=0; i<word.length(); i++){

            if(Character.isUpperCase(word.charAt(i))){
                cap++;
            } else{
                small++;
            }
        }
        if(cap==word.length() || small==word.length()){
            return true;
        }else if(cap==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}
