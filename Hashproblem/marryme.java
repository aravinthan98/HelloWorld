package Hashproblem;

public class marryme {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
////        int t=sc.nextInt();
//        while(t-->0){
            String s="salie";
            String s1="galie";
            int n=s.length();
            boolean value=false;

            if(s1.equals(s)){
                System.out.println("#SadLife");
            }
            else{
                int k=0;
                for(int i=0;i<s1.length();i++){
                    if(s.charAt(0)==s1.charAt(i)){
                        k=i;
                        value=false;
                        int l=0;
                        for(int j=k;l<n;l++){
                            if(s.charAt(l)!=s1.charAt(j)){
                                value=true;
                            }
                            j++;
                        }
                        if(!value){
                            break;
                        }
                    }
                    else {
                        value=true;
                    }
                }
                if(value){
                    System.out.println("#DieSingle");
                }
                else{
                    System.out.println("#SadLife");
                }

            }

//        }

    }
}
