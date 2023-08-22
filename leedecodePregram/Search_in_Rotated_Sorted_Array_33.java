package leedecodePregram;

public class Search_in_Rotated_Sorted_Array_33{
    public static void main(String[] args) {
       int[]arr= {5, 6, 7, 8, 9, 10, 1, 2, 3};  //5/2   3
        int key=3;
       int ans= findkeyindex(arr,key);
       if(ans==-1){
           System.out.print("Not found");
       }
       else{
           System.out.print(ans);
       }
    }
    public static int findkeyindex(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>=arr[left]){
                if(arr[mid]>=key&&arr[left]<=key){
                    right=mid-1;
                }
                else{
                   left=mid+1;
                }
            }
            else{
                if(key>=arr[mid+1]&&key<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }

        return -1;
    }
}
