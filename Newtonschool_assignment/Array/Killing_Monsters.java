package Newtonschool_assignment.Array;

import java.util.Scanner;

//N+1 towns are going to be attacked by monsters. The i-th town will be attacked by Ai monsters.
// Saloni has got N of her friends for rescue. The i-th friend has the capability to kill
// at most Bi monsters. The only constraint is that the i-th friend can kill monsters from
// town i and i+1 only.Find the maximum number of monsters the friends can kill.
//Sample Input
//2
//3 5 2
//4 5
//
//Sample Output
//9
public class Killing_Monsters {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] monster=new int[N+1];
        int[] hero=new int[N];
        for(int i=0;i<monster.length;i++){
            monster[i]=sc.nextInt();
        }
        for(int i=0;i<hero.length;i++){
            hero[i]=sc.nextInt();
        }
        attack(monster,hero);                     // Your code here
    }
    public static void attack(int[] monster,int[] hero){
        long Kills=0;
        for(int i=0;i<hero.length;i++){
            if(monster[i]<=hero[i]){
                Kills +=monster[i];
                hero[i]=hero[i]-monster[i];
                if(monster[i+1]<=hero[i]){
                    Kills +=monster[i+1];
                    monster[i+1]=0;
                }
                else{
                    Kills +=hero[i];
                    monster[i+1]=monster[i+1]-hero[i];
                }
            }
            else{
                Kills +=hero[i];
            }
        }
        System.out.print(Kills);
    }
}
