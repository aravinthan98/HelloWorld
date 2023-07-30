package leedecodePregram.dynamic_programming;
//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class Climbing_Stairs_70 {
    public static void main(String[] args) {
        int n=2;
            int prev=1;
            int cur=1;
            for(int i=2;i<=n;i++){
                int temp=cur;
                cur=cur+prev;
                prev=temp;
            }
            System.out.print(cur);

    }
}
