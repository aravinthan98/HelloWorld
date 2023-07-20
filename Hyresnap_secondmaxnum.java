public class Hyresnap_secondmaxnum {
    public static void main(String[] args){
        int[] array={23,4,75,2,43,1,7,5,75};

        int firstmax=-1;
        int secondmax=-1;
        int thirdmax=-1;

        for(int i=0;i<array.length;i++){
            int num=array[i];
            if(num>firstmax){
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=num;
            }
            else if(num>secondmax&&num<firstmax){
                thirdmax=secondmax;
                secondmax=num;

            }
            else if(num>thirdmax&&num<secondmax){
                thirdmax=num;
            }
        }
        System.out.print(thirdmax);
    }
}
