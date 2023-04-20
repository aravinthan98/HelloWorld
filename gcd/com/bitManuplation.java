package gcd.com;

public class bitManuplation {
    public static void main(String[] args) {
        int n=65;
        int[] arr={2,3,5,7,3,5,7,6,};

//        System.out.println(countOfSetBit(n,0));
 //       System.out.print(powerof2(n));
 //       System.out.println(findNonrepeatElement(arr));
        int arr1[] = TwoNonRepeating(arr);
        System.out.println(arr1[0] + " " + arr1[1]);

    }
    public static int countOfSetBit(int n,int count){
        while(n>0){
            int mask=(~n)+1;// set bit means ones in binary value ex 1 0 1 1
            int ans=mask & n;
            count++;
            n=n^ans;

        }
        return count;
    }
    public static int powerof2(int n){
        int ans=n & (n-1);
        return ans;
        //if we get ans==0 it is power of 2
        //else it is not power of 2
    }
    public static int findNonrepeatElement(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans ^=arr[i];
        }
    return ans;
    }
    public static int[] TwoNonRepeating(int[] arr) {
        int xorNum = 0;
        for (int i = 0; i < arr.length; i++) {
            xorNum ^= arr[i];
        }

        int rightMostSetBit = xorNum & -xorNum;


        int group1 = 0; // resembles the rightMostSetBit
        int group2 = 0; // doesNot resembles the right most bit

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if((val & rightMostSetBit) == 0) {
                group1 ^= val;
            } else {
                group2 ^= val;
            }
        }
        return new int[]{group1, group2};

    }
}
