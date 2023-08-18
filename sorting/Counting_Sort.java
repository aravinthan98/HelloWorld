package sorting;
//it will work for non negative values
public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr={4,2,7,1,9};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int[] newarr=new int[max+1];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }
        int count=0;
        for(int i=0;i<=max;i++){
            if(newarr[i]!=0){
                count++;
                System.out.print(i+" ");
            }
        }
    }
}
