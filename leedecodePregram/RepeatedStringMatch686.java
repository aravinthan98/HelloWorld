package leedecodePregram;
//Given two strings a and b, return the minimum number of times you should repeat string a so that
// string b is a substring of it.If it is impossible for b to be a substring of a after repeating it, return -1.
public class RepeatedStringMatch686 {
    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";
        System.out.println(longestCommonPrefix(a,b));
    }
    public static int longestCommonPrefix(String a,String b) {
        StringBuilder sb=new StringBuilder();
        int n=(int)Math.ceil((double) b.length()/(double) a.length());

        int t=n;
        while (t!=0){
            sb.append(a);
            t--;
        }

        //String s=String.join("",Collection.nCopies(n,a));
        // we can this instead of while loop to add string n times
        String s=sb.toString();

           if(s.contains(b)){
              return n;
           }
           if((s+a).contains(b)){
               return n+1;
           }

        return -1;

    }
}
