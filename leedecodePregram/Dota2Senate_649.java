package leedecodePregram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dota2Senate_649 {
    public static void main(String[] args) {
        String s= "DDRRR";// DDRD;
        String ans=predictPartyVictory(s);
        System.out.println(ans);
    }
    public static String  predictPartyVictory(String senate) {
//        int len=senate.length();
//  ---------1st Approach--------------
//        Queue<String>queue=new LinkedList<>();
//        Queue<String>queue1=new LinkedList<>();
//
//        for (int i = 0; i < len; i++) {
//            if(senate.charAt(i)=='R'){
//                queue.add("Radiant");
//            }
//            else{
//                queue.add("Dire");
//            }
//        }
//        while(queue.size()>1){
//            if(queue1.isEmpty()) {
//                queue1.add(queue.poll());
//            }
//           while (!queue.isEmpty()&&queue1.peek()== queue.peek()){
//               queue1.add(queue.poll());
//           }
//           if(!queue.isEmpty()&&queue1.peek()!= queue.peek()){
//              queue.poll();
//           }
//           queue.add(queue1.poll());
//        }
//        return queue.poll();

       // ---------------2nd Approach-------------
//        int len=senate.length();
//        Queue<String>queue=new LinkedList<>();
//        Queue<String>queue1=new LinkedList<>();
//
//        for (int i = 0; i < len; i++) {
//            if(senate.charAt(i)=='R'){
//                queue.add("Radiant");
//            }
//            else{
//                queue.add("Dire");
//            }
//        }
//        while(!queue.isEmpty()){
//            if(queue1.isEmpty()) {
//                queue1.add(queue.poll());
//            }
//            if(!queue.isEmpty()&&queue1.peek()== queue.peek()){
//                queue1.add(queue.poll());
//            }
//            else if(!queue.isEmpty()&&queue1.peek()!= queue.peek()){
//                queue.poll();
//                queue.add(queue1.poll());
//            }
//        }
//        if(!queue1.isEmpty()){
//            queue.add(queue1.poll());
//        }
//        return queue.poll();
        //-----------3rd approach-------------
        int len=senate.length();
        Queue<Integer>direq=new LinkedList<>();
        Queue<Integer>radiantq=new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if(senate.charAt(i)=='D'){
                direq.add(i);
            }
            else{
                radiantq.add(i);
            }
        }
        while(!direq.isEmpty()&&!radiantq.isEmpty()){
            if(direq.peek()<radiantq.peek()) {
                direq.add(++len);
            }
            else{
                radiantq.add(++len);
            }
            radiantq.poll();
            direq.poll();
        }
        return direq.isEmpty()?"Radiant":"Dire";
    }
}
