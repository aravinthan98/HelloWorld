import java.util.ArrayList;
import java.util.Stack;

public class dsa2test {
    public static void main(String[] args) {
       String str="a2bc5d89X";//abcba


        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isAlphabetic(c)){
                list.add(c);
            }
        }
        int p1=0;
        int p2= list.size()-1;

          for(int i=0;i<str.length();i++){
              char s=str.charAt(i);
              if(Character.isAlphabetic(s)){
                  System.out.print(list.get(p2));
                  p2--;
              }
              else {
                  System.out.print(s);
              }
          }
    }
}
