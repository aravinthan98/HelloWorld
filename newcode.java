public class newcode {
    public static void main(String[] args) {
//        int[] arr={-1,-2,-3,-4,5};
//        for(int i=0;i<arr.length;i++) {
//
//            System.out.print(arr[i]*arr[i]+" ");
//        }
        int n=121;
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }

        System.out.print(n==sum?"Yes":"No");
    }
}
