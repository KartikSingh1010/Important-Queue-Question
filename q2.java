//implement stack using queue

/*
    two ways:
    1) push efficient : jisme push funcn O(1) m chlega pop or peek o(n) m
    2) pop eff : isme pop or peek o(1) m or push o(n) m 
 */

//push eff:

import java.util.*;
public class q2 {
    public static class Stack{
        Queue<Integer> q = new LinkedList<>();

        public void push(int val){
            q.add(val);
        }
        public int pop(){
            for(int i=0; i<q.size()-1; i++){ //0 se shru krna h video m 1 se shuru kra h bo glt h
                q.add(q.poll());
            }
            return q.poll();
        }
        public int peek(){
            for(int i=0; i<q.size()-1; i++){  //0 se shru krna h video m 1 se shuru kra h bo glt h
                q.add(q.remove());
            }
            int x =q.peek();
            q.add(q.remove());
            return x;
        }
        public boolean isEmpty(){
            return q.isEmpty();
        }
        
    } 
    public static void main(String[] args) {
            }
    }
  // run code in leetcode q-255


  //pop and peek eff:
  /*
        public void push(int val){
            if(q.size()==0) q.add(val);
            else{
                q.add(val);
                for(int i=0; i<q.size()-1; i++){  //0 se shru krna h video m 1 se shuru kra h bo glt h
                    q.add(q.remove());
                }
            }
        
          } 

   */