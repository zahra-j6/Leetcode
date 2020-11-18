package Leetcode;

import java.util.Stack;
//https://leetcode.com/problems/reverse-linked-list/
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            st.push(head.val);
            head=head.next;
        }
        ListNode dummy  =new ListNode(-1);
        ListNode new_node=dummy;
        while(!st.isEmpty()){
            new_node.next=new ListNode(st.pop());
            new_node=new_node.next;
        }
        return dummy.next;
    }

}
