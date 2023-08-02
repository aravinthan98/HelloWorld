package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {
    public static void main(String[] args) {
        int n=5;

        List<List<Integer>> gene=generate(n);
        System.out.print(gene);
    }
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>>listg=new ArrayList<>();

        for(int line = 1; line <= numRows; line++){

            int C=1;
            ArrayList<Integer>list=new ArrayList<>();
            for(int i = 1; i <= line; i++)
            {
                // The first value in a line is always 1
                list.add(C);
                C = C * (line - i) / i;
            }
            listg.add(list);
        }

        return listg;
    }
}
