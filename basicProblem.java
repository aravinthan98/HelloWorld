public class basicProblem {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        int target=9;
        int n=arr.length;
        int l=0;
        int h=n-1;
        int mid=(l+h)/2;
        while(l<=h) {
                mid=(l+h)/2;
            if (arr[mid] == target) {
                System.out.print(arr[mid]);
                break;
            }
            else if (arr[mid] <= target) {
                l = mid + 1;
            }
            else if (arr[mid] >= target) {
                h = mid - 1;
            }
        }
    }
}
