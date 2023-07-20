public class Hyresnap_searching {
    public static void main(String[]args){
        int[] array={1,2,3,4,5,6,7};
        int target=5;

       System.out.print(binarysearch(array,target));

    }
    public static int binarysearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }

        return -1;
    }
}
