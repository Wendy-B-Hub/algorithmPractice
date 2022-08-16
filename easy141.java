package solutions;

import utils.ListNode;



public class easy141 {
    public static void main(String[] args) {

    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}













































































