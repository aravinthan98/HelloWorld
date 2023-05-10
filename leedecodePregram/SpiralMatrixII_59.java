package leedecodePregram;

public class SpiralMatrixII_59 {
    public static void main(String[] args) {
        int n=3;
        int[][] arr=generateMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int p1=0;
        int p2=n-1;
        int p3=n-1;
        int itr=1;
        while((p1<=p2)&&(p1<=p3)){
            for (int i = p1; i<=p3; i++) {
                if(itr<=n*n){
                    arr[p1][i]=itr++;
                }
            }
            if (n > 1){
                for (int i =p1+1; i <=p2; i++) {
                    if(itr<=n*n){
                        arr[i][p3]=itr++;
                    }
                }
                for (int i =p3-1; i >=p1; i--) {
                    if(itr<=n*n){
                        arr[p2][i]=itr++;
                    }
                }
            }
            for(int i=p2-1;i>p1;i--){
                if(itr<=n*n){
                    arr[i][p1]=itr++;
                }
            }

            p1++;
            p2--;
            p3--;
        }
        return arr;
    }
}
