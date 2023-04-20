package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class intro {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        Queue<Integer>queue1=new LinkedList<>();
        Queue<Integer>queue2=new LinkedList<>();
        queue.add(1);
        queue.add(100);
        queue.add(3001);
        queue.add(3002);

        while (!queue.isEmpty()){
            int count=0;
            int k=queue.peek();
            int ans=k-3000;

            queue1.add(k);
            while (!queue1.isEmpty()){
                if(ans<=queue1.peek()  && k>=queue1.peek()){
                    count++;
                }
                queue2.add(queue1.poll());

            }
            while (!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
           queue.poll();
            System.out.print(count+" ");
        }


    }
}
