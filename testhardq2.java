public class testhardq2 {
    public static void main(String[] args) {
        int X[] = { 1, 4, 7, 8, 10 };  //1 2  7 8 10
                                        // 4 3 9
        int Y[] = { 2, 3, 9 };

        int xarrindex=0;
        int yarrindex=0;
        int itr=0;
        int xarrlen=X.length;
        int yarrlen=Y.length;

        int[] mergearr=new int[xarrlen+yarrlen];//1 2 3
        while (xarrindex<xarrlen && yarrindex<yarrlen){
            if(X[xarrindex]<=Y[yarrindex]){
                mergearr[itr++]=X[xarrindex++];
            }
           else {
                mergearr[itr++]=Y[yarrindex++];
            }
        }
        while(xarrindex<xarrlen){
            mergearr[itr++]=X[xarrindex++];
        }
        while(yarrindex<yarrlen){
            mergearr[itr++]=Y[yarrindex++];
        }

      for(int i=0;i<mergearr.length;i++){
        if(i<xarrlen){
            X[i]=mergearr[i];
        }
        else{
            Y[i-xarrlen]=mergearr[i];
        }
      }
        for(int i=0;i<xarrlen;i++){
            System.out.print(X[i]+" ");
        }
        System.out.println();
        for(int i=0;i<yarrlen;i++){
            System.out.print(Y[i]+" ");
        }


    }
}
