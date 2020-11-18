package Leetcode;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/submissions/
class MyQueue {

        /** Initialize your data structure here. */
        Stack<Integer> st;
        int cnt=0;
        public MyQueue() {
            st=new Stack<>();

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            st.push(x);
            cnt++;

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            int val=st.firstElement();
            System.out.println(val);
            st.removeElement(val);
            cnt--;
            return val;

        }

        /** Get the front element. */
        public int peek() {
            int val=st.firstElement();
            return val;

        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(cnt==0)
                return true;
            else
                return false;

        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class Implement_Queue_using_Stacks {

}
