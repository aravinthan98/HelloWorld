package Newtonschool_assignment.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kth_permutation {
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=sc.nextInt();
        int t=5;
        String s="123";
//        for(int i=1;i<=n;i++){
//            s=s+i;
//        }

        ArrayList<String> list=new ArrayList<>();
        ArrayList<String>ans=new ArrayList<>();
        permutation(list,s,"",0,t);
        Collections.sort(list);
        ans.add(list.get(0));
        for(int i=1;i<list.size();i++){
            if(!(list.get(i-1).equals(list.get(i)))){
                ans.add(list.get(i));
            }
        }


        System.out.print(ans.get(t-1));

    }
    public static void permutation(ArrayList<String>list,String s,String ans,int count,int t){
        if(s.length()==0){
            list.add(ans);
            count++;
            return;
        }
        for(int i=0;i<s.length();i++){
            if(count==t){
                break;
            }
            char ch=s.charAt(i);
            String res=s.substring(0,i)+s.substring(i+1);
            permutation(list,res,ans+ch,count,t);

        }
    }
}
