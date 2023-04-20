public class testhardq2 {
    public static void main(String[] args) {
        int X[] = { 1, 4, 7, 8, 10 };  //1 2  7 8 10
                                        // 4 3 9
        int Y[] = { 2, 3, 9 };

        int p1=0;
        int p2=0;
        int n=X.length;
        int m=Y.length;


//        while (p1<=n&&p2<=m){
//            if(X[p1]>Y[p2]){
//
//                int temp=X[p1];
//                X[p1]=Y[p2];
//                Y[p2]=temp;
//
//                p2++;
//            }
//           else {
//               p1++;
//            }
//        }
//        while(p1<=n){
//            int temp=X[p1];
//            X[p1]=Y[p2];
//            Y[p2]=temp;
//        }


      for(int i=0;i<n;i++){

          for(int j=0;j<m;j++){
              if(X[i]>Y[j]){
                  int temp=X[i];
                  X[i]=Y[j];
                  Y[j]=temp;
              }
          }
      }
        for(int i=0;i<n;i++){
            System.out.print(X[i]+" ");
        }
        System.out.println();
        for(int i=0;i<m;i++){
            System.out.print(Y[i]+" ");
        }


    }
}
