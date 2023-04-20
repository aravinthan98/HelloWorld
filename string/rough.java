package string;

public class rough {
    //base7
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        int num=-1;
        int copy=num;
        if(num<0){
            num=-(num);
        }
        while(num !=0){
            int r=num%7;
            sb.append(r);
            num=num/7;
        }
        sb.reverse();
        String ans= sb.toString();

        if(copy==0){
            ans=""+copy;
        }
        if(copy<0) {
             ans = "-" + ans;
        }

        System.out.println(ans);
    }
}
