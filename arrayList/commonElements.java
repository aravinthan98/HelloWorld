package arrayList;

import java.util.ArrayList;

public class commonElements {
    public static void main(String args[])
    {
        int ar1[] = {1, 5, 10, 20, 40, 80};

        int ar2[] = {6, 7, 20, 80, 100};

        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};


        int m=ar1.length;
        int n=ar2.length;
        int z=ar3.length;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.contains(ar2[i])){
                list.add(ar2[i]);
            }
        }
        for(int i=0;i<m;i++){
            if(!list.contains(ar1[i])){
                list1.add(ar1[i]);
            }
        }
        for(int i=0;i<z;i++){

        }
    }
}

