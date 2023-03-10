package pattern1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class nApps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Math.sqrt(N);i++){
            sum =sum+(i*i);
            if(sum>=N){
                sum=Math.abs(sum-(i*i));
                break;
            }
        }
        System.out.print(sum);

    }
}
