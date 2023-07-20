package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//given two string need to remove common char in both string but we can remove equal number of ch,then remainig
//length of string we can use for flames like 1-friends,2-love
public class flams {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Character>list1=new ArrayList<>();
        String s1="saumya";
        String s2="ansh";
        char[] arr=s2.toCharArray();

        for(int i=0;i<s1.length();i++){
            list.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(list.contains(s2.charAt(i))){
                int k=list.indexOf(s2.charAt(i));
                list.remove(k);
            }
            else{
                list1.add(s2.charAt(i));
            }
        }
        int ans=list.size()+list1.size();


        System.out.print(flames(ans));
        // Your code here
    }
    public static String flames(int ans){
        String res="";
        switch(ans%6){
            case 1 :
                res="Frieds";
                break;
            case 2 :
                res="Love";
                break;
            case 3 :
                res="Affection";
                break;
            case 4 :
                res="Marriage";
                break;
            case 5 :
                res="Enemy";
                break;
            case 0 :
                res="Siblings";
                break;
        }
        return res;

    }
}
