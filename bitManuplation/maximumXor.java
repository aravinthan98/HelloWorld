package bitManuplation;

import java.util.Queue;

public class maximumXor {
    public static void main(String[] args) {
        int n=4;

        int[] arr={1,2,3,4};

        int max=0;
        for(int i=0;i<n;i++){
            int fir=0;
            for(int j=i;j<n;j++){
                fir^=arr[j];
                max=Math.max(fir,max);

            }
        }
        System.out.print(max);
    }

}
