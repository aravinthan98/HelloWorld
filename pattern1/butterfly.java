package pattern1;

public class butterfly {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l <n-i; l++) {
                    System.out.print("  ");
            }
            for (int p =0; p<=i; p++) {
                    System.out.print("* ");
            }

            System.out.println();
        }
        for(int q=0;q<n+n+2;q++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=n;i>0;i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            for (int k =i; k<n+1; k++) {
                System.out.print("  ");
            }
            for (int l =i-1; l<n; l++) {
                System.out.print("  ");
            }
            for (int p =0; p<i; p++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
