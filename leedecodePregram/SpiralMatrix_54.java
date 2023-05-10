package leedecodePregram;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer>list=spiralOrder(arr);
        System.out.println(list);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int p1=0;
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        int p2=m-1;
        int p3=n-1;
        while((p1<=p2)&&(p1<=p3)){
            for (int i = p1; i<=p3; i++) {
                if(list.size()<m*n){
                    list.add(matrix[p1][i]);
                }
            }
            if (m > 1){
                for (int i =p1+1; i <=p2; i++) {
                    if(list.size()<m*n){
                        list.add(matrix[i][p3]);
                    }
                }
                for (int i =p3-1; i >=p1; i--) {
                    if(list.size()<m*n){
                        list.add(matrix[p2][i]);
                    }
                }
            }
            for(int i=p2-1;i>p1;i--){
                if(list.size()<m*n){
                    list.add(matrix[i][p1]);
                }
            }

            p1++;
            p2--;
            p3--;
        }
        return list;
    }
}
