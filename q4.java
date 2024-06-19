// reorder queue --> 1 2 3 4 5 6 7 8 --> 1 5 2 6 3 7 4 8

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        Stack<Integer> st = new Stack<>();
        int n =q.size()/2;
        for(int i=0; i<n ; i++){
            st.push(q.poll());   // q--> 5 6 7 8     st -> 4 3 2 1
        }

        while (!st.isEmpty()) {
            q.add(st.pop());   // 5 6 7 8 4 3 2 1
        }

        for(int i=0; i<n ; i++){
            st.push(q.poll());   // q--> 4 3 2 1     st -> 8 7 6 5 
        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove()); 
        }
        // q--> 8 4 7 3 6 2 5 1

        // last step reverse it using stack
        while (!q.isEmpty()) {
            st.add(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
