package leedecodePregram;

public class findtheArrayConcatenationValue2562 {
    public static void main(String[] args) {
        int[] arr={12,23,5,56,34};
        System.out.println(findTheArrayConcVal(arr));
    }
    public static long findTheArrayConcVal(int[] nums) {
        int p1=0;
        int p2=nums.length-1;
        long ans=0;
        long sum=0;
        while(p1<=p2){
            String s="";
            if(p1==p2){
                s=""+nums[p1];

            }
            else{
                s=""+nums[p1]+""+nums[p2];

            }
            ans=Long.parseLong(s);
            sum +=ans;

            p1++;
            p2--;
        }
        return sum;
    }
}
