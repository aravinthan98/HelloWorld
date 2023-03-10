package pattern1;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M =5;
        int N =3;
        for(int i=1; i<=M; i++){
            for(int j=1; j<=N; j++ ){
                if ((i == 1) || (i == M)){
                    System.out.print("*");
                }
                else if((j==1)||(j==N)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
