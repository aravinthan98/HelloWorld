
public class gokul {
    public static void main(String[] args) {
        int t=1;
        while(t-->0){
            int n=13;
            int set_bits=0;
            while (n > 0)
            {
                if ((n & 1) != 0)
                    set_bits++;
                n=n>>1;
            }
            System.out.println(1 << set_bits);
        }
    }
}
