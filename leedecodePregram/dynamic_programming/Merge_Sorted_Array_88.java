package leedecodePregram.dynamic_programming;
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored
// inside the array nums1. To accommodate this, nums1 has a length of m + n, where the
// first m elements denote the elements that should be merged, and the last n elements
// are set to 0 and should be ignored. nums2 has a length of n.
public class Merge_Sorted_Array_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        int p1=m-1;
        int p2=n-1;
        int itr=nums1.length-1;

        while(p1>=0&&p2>=0){
            if(nums1[p1]<=nums2[p2]){

                nums1[itr--]=nums2[p2--];

            }
            else{
                nums1[itr--]=nums1[p1--];

            }
        }
        while(p2>=0){
            nums1[itr--]=nums2[p2--];
        }


    }
}
