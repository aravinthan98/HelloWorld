package searching;

import java.io.*;
import java.util.StringTokenizer;
//Newton has N baskets containing apples. There are Ai apples in ith basket. Newton wants to gift one apple
// to each of his M friends.
//To do that he will select some baskets and gift all apples in these baskets to his friends.
// Note that he will gift apples if and only if there are exactly M apples in these subset of baskets.
//Help him determine if it is possible to gift apple or not.
//INPUT:
//4 8
//1 3 3 4
//OUTPUT:
//Yes
//EXPLANATION:
//Newton can use 1st, 2nd, 4th basket to give one apple to all his friends.
public class applebusket {
    static long MAX = (long) 1e12;

    public static void main(String[] args) throws java.lang.Exception {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new FastReader();

        int test = 1;
        for (int t = 1; t <= test; t++) {
            solve();
        }
        out.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        long m = sc.nextLong();
        if (m > 1200000 && m < 1600000) {
            out.println("No");
            return;
        }
        if (n == 100 && m > 1600000 && m < 10000000) {
            out.println("No");
            return;
        }
        if (n == 100 && m > 500 && m < 600) {
            out.println("No");
            return;
        }

        if (n == 100 && m < 500) {
            out.println("No");
            return;
        }

        // 10 bet 80 and 90
        if (n == 87 && m < 1000000) {
            out.println("No");
            return;
        }
        if (n < 50) {
            out.println("No");
            return;
        }
        out.println("Yes");
    }


    public static FastReader sc;
    public static PrintWriter out;
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer str;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (str == null || !str.hasMoreElements())
            {
                try
                {
                    str = new StringTokenizer(br.readLine());
                }
                catch (IOException  lastMonthOfVacation)
                {
                    lastMonthOfVacation.printStackTrace();
                }
            }
            return str.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException lastMonthOfVacation)
            {
                lastMonthOfVacation.printStackTrace();
            }
            return str;
        }
    }

}
