package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?
//
//The phrase "saba" must look one of these shapes:
//Sample Input 1:
//5 5
//s a f e r
//a m j a d
//b a b o l
//a a r o n
//s o n g s
//
//Sample Output 1:
//2
public class Grid_and_phrase {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int numOfRows=sc.nextInt();
        int numOfCols=sc.nextInt();
        char [][]arr=new char[numOfRows][numOfCols];
        for(int row=0;row<numOfRows;row++)
        {
            for(int col=0;col<numOfCols;col++)
            {
                arr[row][col]=sc.next().charAt(0);
            }
        }
        //horigentlly
        int count=0;
        for(int row=0;row<numOfRows;row++){
            for(int col=0;col<numOfCols;col++){
                if(arr[row][col]=='s'){
                    if(col<=numOfCols-4){
                        if(arr[row][col+1]=='a' && arr[row][col+2]=='b' && arr[row][col+3]=='a'){
                            count++;
                        }
                    }
                    if(row<=numOfRows-4){
                        if(arr[row+1][col]=='a' && arr[row+2][col]=='b' && arr[row+3][col]=='a') {
                            count++;
                        }
                    }
                    if(row<=numOfRows-4 && col<=numOfCols-4){
                        if(arr[row+1][col+1]=='a' && arr[row+2][col+2]=='b' && arr[row+3][col+3]=='a') {
                            count++;
                        }
                    }
                    if(row>=3 && col<=numOfCols-4) {
                        if(arr[row-1][col+1]=='a' && arr[row-2][col+2]=='b' && arr[row-3][col+3]=='a') {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
