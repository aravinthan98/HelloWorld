public class aravinth {
    public static void main(String[] args) {
        int N=123;
         int[] digit=new int[10];
         int a=0;
         while(N!=0){
             digit[a] =N%10;
             N=N/10;
             a++;

         }
         int[] arr=new int[a];
         for(int i=0;i<arr.length;i++){
             arr[i]=digit[(a-1)-i];

         }
         int count=0;
        if(a<=1){
            System.out.println("True");
        }
        else {

            for (int i = 0; i < arr.length/2; i++) {
                if(arr[i] != arr[arr.length - 1 - i]){ count++;}
                else {
                    continue;
                }
            }
            if(count>=1){
                System.out.print("False");
            }
            else{
                System.out.print("True");
            }
        }

    }


}