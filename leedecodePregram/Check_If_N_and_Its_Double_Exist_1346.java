package leedecodePregram;

public class Check_If_N_and_Its_Double_Exist_1346 {
    public static void main(String[] args) {
        int[] arr ={-2,0,10,-19,4,6,-8};
        System.out.print(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(2*arr[j]==arr[i]&&i!=j){
                    return true;
                }

            }
        }

        return false;
    }
}
