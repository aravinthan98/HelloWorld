package leedecodePregram;

public class SolvingQuestionsWithBrainpower_2140 {
    public static void main(String[] args) {
        int[][] arr={{1,1},{2,2},{3,3},{4,4},{5,5}};
        System.out.println(mostPoints(arr));
    }
    public static long mostPoints(int[][] questions) {
        int n=questions.length;
        long[] arr=new long[n];
        arr[n-1]=questions[n-1][0];

        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i+1];

            long curmax=questions[i][0];
            int index=i+questions[i][1]+1;

            if(index<n){
                curmax +=arr[index];
            }

            arr[i]=Math.max(arr[i],curmax);
        }
        return arr[0];
    }
}
