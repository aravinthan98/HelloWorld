import java.util.HashMap;
import java.util.Stack;

public class dsa2test1 {
    public static void main(String[] args) {
//        String s="abcdcba";
//        int n=s.length();
//        String rev="";
//        Stack<Character>stack=new Stack<>();
//        for(int i=0;i<n;i++){
//            stack.push(s.charAt(i));
//        }
//        while(!stack.empty()){
//            rev+=stack.pop();
//        }
//        if(s.equals(rev)){
//            System.out.print("true");
//
//        }
//        else{
//            System.out.print("false");
//        }
        int[] arr={4,5,6,7,7};
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();
        int rep=0;
        int mis=0;
        int i=arr[0];
        int h=i+n;
        for(int j=0;j<n;j++){
            if(map.containsKey(arr[j])){
                rep=arr[j];
                break;
            }
            else{
                map.put(arr[j],1);
            }
        }
        System.out.print(rep+" ");

        while(i<h){
            if(!map.containsKey(i)){
                mis=i;
                break;
            }
            i++;
        }
        System.out.println(mis);
    }
}
