public class Hyresnap_mergesort {
    public static void main(String[]args){
        int[] array={8,4,3,6,2,1,7,9};


        dividearray(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void dividearray(int[] array,int low,int high){

        if(low<high){
            int mid=low+(high-low)/2;
            dividearray(array,low,mid);
            dividearray(array,mid+1,high);
            mergearrays(array,low,mid,high);
        }
    }
    public static void mergearrays(int[] array,int low,int mid ,int high){

        int leftarr=low;
        int rightarr=mid+1;
        int leftlen=mid;
        int rightlen=high;
        int[] mergearray=new int[high-low+1];
        int itr=0;
        while(leftarr<=leftlen&&rightarr<=rightlen){
            if(array[leftarr]<=array[rightarr]){
                mergearray[itr++]=array[leftarr++];
            }
            else{
                mergearray[itr++]=array[rightarr++];
            }
        }

        while(leftarr<=leftlen){
            mergearray[itr++]=array[leftarr++];
        }
        while(rightarr<=rightlen){
            mergearray[itr++]=array[rightarr++];
        }

        int i=0;
        for(int j=low;i<mergearray.length;i++){
            array[j]=mergearray[i];
            j++;
        }

    }


}
