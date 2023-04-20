package string;

public class lengthOfLastWord {
    public static void main(String[] args) {
          String s = "Hello World  ";
        int k=s.length();
        System.out.println(s.charAt(k-3));
        System.out.println(lengthofLastWord(s));
    }
    public static int lengthofLastWord(String s) {
        int n=s.length();


        int index=0;
        for(int i=n-1;i>=0;i--) {

            if (s.charAt(i) != ' ') {
                index = i;
                break;
            }
        }
            int count=0;
            for(int i=index;i>=0;i--){
                if(s.charAt(i)!=' '){
                    count++;
                }
                else{
                    break;
                }
            }

    return count;
    }
}
