package arrays;
//Given an integer array nums, move all 0's to the end of it
// while maintaining the relative order of the non-zero elements.
public class moveZeroes283 {
    public static void main(String[] args) {
        int[] arr={0,3,5,2,0,8,0,6,0};
        movezeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void movezeroes(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }

    }
}
