//implement queue using stacks
// isme do stacks se kaam hoga

import java.util.*;
public class q3 {
    public static class Queue{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        
        public void add(int val){
            st1.push(val);
        }
        public int remove(){
            if(st1.size()==1){
                return st1.pop();
            }
            else{
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
                int x = st2.pop();

                while (!st2.isEmpty()) {
                    st1.push(st2.pop());
                }
                return x;
            }
        }
        public int peek(){
            if(st1.size()==1){
                return st1.peek();
            }
            else{
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
                int x = st2.peek();

                while (!st2.isEmpty()) {
                    st1.push(st2.pop());
                }
                return x;
            }
        }
        public boolean isEmpty(){
            if(st1.size()==0) return true;
            else return false;
        }

    }    
    
    public static void main(String[] args) {
            
        }
}
