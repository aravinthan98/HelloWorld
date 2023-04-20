import java.util.ArrayList;
import java.util.Arrays;
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
        int[] arr={3,4,5,3,6,8};
        Arrays.sort(arr);

        int n=arr.length;

        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        int rep=0;
        int mis=0;
        int i=arr[0];
        int h=i+n;
        for(int j=0;j<n;j++){
            if(list1.contains(arr[j])){
                list.add(arr[j]);

            }
            else{
                list1.add(arr[j]);
            }
        }
        System.out.println(list);


        while(i<h){
            if(!list1.contains(i)){ //3 4 5 6 8
                mis=i;
                break;
            }
            i++;
        }
        System.out.println(mis);
    }
}
