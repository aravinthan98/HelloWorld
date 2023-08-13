package leedecodePregram;

public class next_greater_Element_III_556 {
    public static void main(String[] args) {
       int n=12;
        System.out.print(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        String s=""+n;
        int len=s.length();
        char[] carr=new char[len];

        for(int i=0;i<len;i++){
            carr[i]=s.charAt(i);
        }
        boolean flag=false;
        for(int i=0;i<len-1;i++){
            int num=s.charAt(i)-'0';
            int num1=s.charAt(i+1)-'0';
            if(num<num1){
                flag=true;
            }
        }
        if(!flag){
            return -1;
        }

        int sum=0;

        char temp=carr[len-1];
        carr[len-1]=carr[len-2];
        carr[len-2]=temp;

        for(int i=0;i<len;i++){
            sum=(sum*10)+(carr[i]-'0');
        }
        return sum;
    }
}
