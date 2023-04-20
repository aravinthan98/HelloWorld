public class testhard {
    public static void main(String[] args) {
        int[] arr={-3, 1, 4, -5, -4, 2, 3};

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];

                    if(sum==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        break;
                    }
                }



            }
        }
    }
}
