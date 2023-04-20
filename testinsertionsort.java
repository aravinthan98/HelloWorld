public class testinsertionsort {
    public static void main(String[] args) {
        int[] arr={3,2,5,8,5,1,9};
        int n=arr.length;

        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        return arr;
    }
}
