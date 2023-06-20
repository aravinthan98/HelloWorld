import java.util.Scanner;

public class gokul {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // number of test cases

            while (t-- > 0) {
                int n = scanner.nextInt(); // length of array
                int k = scanner.nextInt(); // value of K

                int[] arr = new int[n]; // array A
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }

                int count = findPairCount(arr, k);
                System.out.println(count);
            }


        }

        private static int findPairCount(int[] arr, int k) {
            int[] freq = new int[k]; // store frequency of remainders

            // Count the frequency of remainders
            for (int num : arr) {
                int remainder = num % k;
                freq[remainder]++;
            }



            int count = 0;

            // Count pairs where (A[i] * A[j]) mod K = 0
            count += (freq[0] * (freq[0] - 1)) / 2; // Count pairs where both elements are divisible by K

            if (k % 2 == 0) {
                count += (freq[k / 2] * (freq[k / 2] - 1)) / 2; // Count pairs where both elements have remainder k/2
            }

            for (int i = 1; i < k / 2; i++) {
                count += freq[i] * freq[k - i]; // Count pairs where one element has remainder i and the other has remainder k-i
            }

            return count;
        }




}
