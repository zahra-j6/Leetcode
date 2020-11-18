package Leetcode;
//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class merge_2_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum =  new ListNode(-1);
        ListNode new_list=dum;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        while(l1!=null && l2!=null){
            if(l1.val< l2.val){
                new_list.next= l1;
                l1=l1.next;
                new_list=new_list.next;
            }
            else{
                new_list.next= l2;
                l2=l2.next;
                new_list=new_list.next;
            }
        }

        while(l1!=null){
            new_list.next=l1;
            l1=l1.next;
            new_list=new_list.next;
        }
        while(l2!=null){
            new_list.next=l2;
            l2=l2.next;
            new_list=new_list.next;
        }

        /*
            if(l1.val==l2.val){
                new_list.next=l1;
                l1=l1.next;
                new_list.next=(l2);
                l2=l2.next;

            }
            else{
                    new_list.next=l2;
                    l2=l2.next;
                new_list.next=l1;
                l1=l1.next;
                            }
        }*/
        return dum.next;
    }
}
