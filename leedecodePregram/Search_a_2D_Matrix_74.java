package leedecodePregram;

public class Search_a_2D_Matrix_74 {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20}};
        int target=3;
        System.out.print(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;

        while(i<matrix.length&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else if(matrix[i][j]<target){
                i++;
            }
        }

        return false;
    }
}
