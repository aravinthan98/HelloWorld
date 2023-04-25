package arrayList;

import java.util.ArrayList;

public class RoundNumber {
    public static void main (String[] args) {
//        Scanner sc=new Scanner(System.in);
        int n=5009;
        ArrayList<Integer> list=new ArrayList<>();
        int infix=n/10;
        list.add(infix*10);

        int count=0;
        while(n>9){
            int r=n%10;
            if(count==0){
                list.add(r);
            }
            else if(r!=0){
                double sum=Math.pow(10,count);
                int res=r*(int)sum;
                list.add(res);

            }
            count++;
            n=n/10;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
