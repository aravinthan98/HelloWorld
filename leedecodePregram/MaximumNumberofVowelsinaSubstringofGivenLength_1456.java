package leedecodePregram;
//Given a string s and an integer k, return the maximum number of vowel letters in any substring
// of s with length k.
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
public class MaximumNumberofVowelsinaSubstringofGivenLength_1456 {
    public static void main(String[] args) {
        String s="abediiujl";
        int k=3;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s, int k) {
        int n=s.length();
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<k){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
            }
            else{
                char ch1=s.charAt(i-k);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
                if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
                    count--;
                }
            }
            max=Math.max(count,max);
            if(max==k){
                break;
            }
        }

        return max;
    }
}
