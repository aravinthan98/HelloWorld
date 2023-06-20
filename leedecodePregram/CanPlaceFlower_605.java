package leedecodePregram;

public class CanPlaceFlower_605 {
    public static void main(String[] args) {
        int[] arr={1,0,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(arr,n));

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count=0;
        int index=1;
        int itr=1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                index=i;
                break;
            }
        }
        if(index%2==0){
            itr=0;
        }

        for(int i=itr;i<flowerbed.length;i+=2){

            if(flowerbed[i]!=1){
                count++;

            }
            if(i!=flowerbed.length-1){
                if(flowerbed[i+1]!=0){
                    count--;
                }
            }
        }

        if(count>=n){
            return true;
        }
        return false;
    }
}
