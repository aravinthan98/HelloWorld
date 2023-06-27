package Newtonschool_assignment.basic_programming;

import java.util.Scanner;
//After the decimation, the world went into chaos. People had to rebuild the planet so Shield
// came up with a donation strategy. They feel all the rich guys need to donate more than the poor
// guys. So, they make a rule. They would make a donation list in which the donation of each person
// would be shown. But the rule is that a person can’t pay less than what has already been paid
// before them.Find the extra amount each person will pay, and also, tell shield the total amount of donation.
//Sample Input 2:-
//7
//10 20 30 40 30 20 10
//
//Sample Output 2:-
//0 0 0 0 10 20 30
//220
public class Donation_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        long sum=0;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int maxmoney=0;

        for(int i=0;i<n;i++){
            int currentMoney=arr[i];
            if(currentMoney<maxmoney){
                sum +=maxmoney-currentMoney;
                arr[i]=maxmoney-currentMoney;
            }
            else{
                arr[i]=0;
                maxmoney=currentMoney;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
