package pattern1;

import java.util.Scanner;

public class consecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        while(t>i){
            int x=sc.nextInt();
            boolean IspowerOf2=false;
            if(x<3){
                System.out.println("No");
            }
            else{
                while(x%2==0){
                    x /=2;
                    if(x==1){
                        IspowerOf2=true;
                    }
                }
            }
            if(IspowerOf2){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
            i++;

        }

    }
}
