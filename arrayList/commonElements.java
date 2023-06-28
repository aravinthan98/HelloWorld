package arrayList;

import java.util.ArrayList;

public class commonElements {
    public static void main(String args[])
    {
        int ar1[] = {1, 5, 10, 20, 40, 80};

        int ar2[] = {6, 7, 20, 80, 100};

        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        int i=0,j=0;
        int m=ar1.length;
        int n=ar2.length;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<m && j<n){
            if(ar1[i]==ar2[j]){
                list.add(ar1[i]);
            }

        }

    }
}

