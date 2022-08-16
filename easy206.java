package solutions;

import utils.LinkListNode;
import utils.ListNode;

public class easy206 {

    public static void main(String[] args) {
        ListNode listNode = LinkListNode.buildListNode(new int[]{1, 2, 3, 4, 5});
        ListNode head = reverseList(listNode);
        LinkListNode.printListNode(head);
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode node = reverseList(head.next);
        if(head!=null){
            head.next.next=head;
            head.next=null;
        }
        return node;
    }
}
