package solutions;

import utils.LinkListNode;
import utils.ListNode;

import java.util.List;

public class m19 {
    public static void main(String[] args) {
        ListNode node = LinkListNode.buildListNode(new int[]{1,2});
        ListNode ans = removeNthFromEnd(node, 1);
        LinkListNode.printListNode(ans);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode node=head;
        while (node!=null){
            size++;
            node=node.next;
        }
        ListNode p=new ListNode(-1);
        ListNode dummy=p;
        for(int i=0;i<size&&head!=null;i++){
            if(i<=(size-n-1)){
                p.next=new ListNode(head.val);
                p=p.next;
                head=head.next;
            }else if (i==size-n){
                head=head.next;
            }else if (i>size-n){
                p.next=new ListNode(head.val);
                p=p.next;
                head=head.next;
            }
        }
        return dummy.next;
    }
}


















