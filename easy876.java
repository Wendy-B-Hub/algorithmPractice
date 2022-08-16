package solutions;

import utils.ListNode;

public class easy876 {
    public static void main(String[] args) {

    }
 /*   我们让两个指针 slow 和 fast 分别指向链表头结点 head。

    每当慢指针 slow 前进一步，快指针 fast 就前进两步，
    这样，当 fast 走到链表末尾时，slow 就指向了链表中点。
    */
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}













































