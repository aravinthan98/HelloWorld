package leedecodePregram;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers1689 {
    public static void main(String[] args) {
        String s="32";
        System.out.println(minPartitions(s));
    }
    public static int minPartitions(String n) {
        char best = '0';
        for (char c : n.toCharArray()){
            if (c > best){
                best = c;
            }
        }
        return best - '0';
    }
}
