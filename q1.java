    // reverse first k element of a queue

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
