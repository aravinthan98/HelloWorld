public class meergs {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,9};
        int[] arr1={2,4,6,10,11,12,13,14};
        int l=arr.length-1;
        int h=arr1.length-1;
        int[] merge=new int[l+h+2];
        int p1=0;
        int p2=0;
        int x=0;
         while(p1<=l&&p2<=h){
            if(arr[p1]<=arr1[p2]){
                merge[x++]=arr[p1++];
            }
            else{
                merge[x++]=arr1[p2++];
            }
        }
         while(p1<=l){
             merge[x++]=arr[p1++];
         }
         while(p2<=h){
             merge[x++]=arr1[p2++];
         }

         for(int i=0;i<merge.length;i++){
             System.out.print(merge[i]+" ");
         }

    }
}
