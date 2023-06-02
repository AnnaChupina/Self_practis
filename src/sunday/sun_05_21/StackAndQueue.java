package sunday.sun_05_21;

import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {

        Stack <String> stack = new Stack();
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("selenium");


        System.out.println(stack);
        System.out.println("peek " + stack.peek());  // just looking what on the top

        System.out.println("pop "+ stack.pop());  // looking and removing and returning the toppest element
        System.out.println(stack);

        System.out.println("peek after the first pop "+ stack.peek());

        stack.add("zebra");

        System.out.println("----------------------------");

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("james");
        queue1.offer("anna");
        queue1.offer("asia");

        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println("----------------------------");

        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("james");
        queue2.offer("anna");
        queue2.offer("asia");

        System.out.println(queue2);
        System.out.println(queue2.peek());  // element()  - checks the top of the quque
        System.out.println(queue2.poll());  // removes top of queue
        System.out.println(queue2);
        System.out.println(queue2.peek());  // element()

        Deque<String> queue3 = new LinkedList<>();
        queue3.offer("hello");
        // queue3.get(); // Queue reference cannot access

        // queue3.offerFirst(); the Deque gives access in the beginning and with methods





    }


}
