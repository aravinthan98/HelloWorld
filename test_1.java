public class test_1 {
    public static void main(String[] args) {
        String s="jbvbsabcacbadfe";

        System.out.print(longestpalindrom(s));
    }
    static int max=0;
    public static int  longestpalindrom(String s){
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int even=findmaxfromeven(i,s);
            int odd=findmaxfromOdd(i,s);
            int length=Math.max(even,odd);
            max=Math.max(max,length);
        }
        return max;
    }
    public static int findmaxfromeven(int i,String s){
//        String str="";
//        int left=i;
//        int right=i+1;
//        while(left>=0&&right<=s.length()-1){
//            if(s.charAt(left)==s.charAt(right)){
//                str=s.charAt(left)+str+s.charAt(right);
//
//            }
//            else{
//                break;
//            }
//            left--;
//            right++;
//        }
//
//        return str.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String str1=sb.reverse().toString();
        int length=findmaxpalindrom(s,str1,0,0);
        return max;
    }
    public static int findmaxfromOdd(int i,String s){
        String str=""+s.charAt(i);
        int left=i-1;
        int right=i+1;
        while(left>=0&&right<=s.length()-1){
            if(s.charAt(left)==s.charAt(right)){
                str=s.charAt(left)+str+s.charAt(right);

            }
            else{
                break;
            }
            left--;
            right++;
        }

        return str.length();
    }
    public static int findmaxpalindrom(String s1,String s2,int i,int j){
        if(i>= s1.length()||j>= s2.length()){
            return 0;
        }

        if(s1.charAt(i)==s2.charAt(j)){
            int length=1+findmaxpalindrom(s1,s2,i+1,j+1);
            max=Math.max(length,max);
        }
        findmaxpalindrom(s1,s2,i+1,j);
        findmaxpalindrom(s1,s2,i,j+1);
        return 0;
    }


}
