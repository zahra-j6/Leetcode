package Leetcode;
 class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }
public class Add_Two_Numbers {
    public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 op= new ListNode2(-1);
        ListNode2 res=op;
        while(l1!=null && l2!=null){
           // Decode String
        }

        return op.next;
}
public static void main(String args[]){
        ListNode2 head=new ListNode2(2);
        head.next=new ListNode2(4);
        head.next.next=new ListNode2(3);
    ListNode2 head2=new ListNode2(5);
    head2.next=new ListNode2(6);
    head2.next.next=new ListNode2(4);
    addTwoNumbers(head,head2);
    }
}
