package Newtonschool_assignment.String;

import java.util.HashMap;
import java.util.Scanner;
//Nishu is trying to clean a room, which is divided up into an N by N grid of squares. Each square is initially either clean or dirty. She can sweep her broom over columns of the grid. Her broom is very strange:
//if she sweeps over a clean square, it will become dirty, and if she sweeps over a dirty square, it will become clean.
//She wants to sweep some columns of the room to maximize the number of completely clean rows. It is not allowed to sweep over the part of the column, Nishu can only sweep the whole column.
//
//Return the maximum number of rows that she can make completely clean.
//Sample Input 1:
//4
//0101
//1000
//1111
//0101
//
//Sample output 1:
//2
//
//Explanations:
//Nishu can sweep the 1st and 3rd columns. This will make the 1st and 4th row be completely clean
public class Clean_the_room {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int maxclean=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }
            else{
                map.put(str[i],1);
            }
            maxclean=Math.max(maxclean,map.get(str[i]));

        }
        System.out.print(maxclean);
        // Your code here
    }
}
