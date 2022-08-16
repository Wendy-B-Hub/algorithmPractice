package solutions;

import utils.LinkListNode;
import utils.ListNode;

public class easy21 {
    public static void main(String[] args) {
        ListNode list1 = LinkListNode.buildListNode(new int[]{});
        ListNode list2 = LinkListNode.buildListNode(new int[]{});
        ListNode ans = mergeTwoLists(list1, list2);
        LinkListNode.printListNode(ans);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode dummy=node;
        while (list1!=null || list2!=null){
            if(list1!=null&&list2!=null){
                if(list1.val<=list2.val){
                    node.next=list1;
                    list1=list1.next;
                }else {
                    node.next=list2;
                    list2=list2.next;
                }
            }else if (list1!=null&&list2==null){
                node.next=list1;
                list1=list1.next;
            }else if(list2!=null&&list1==null){
                node.next=list2;
                list2=list2.next;
            }
            node=node.next;
        }
        return dummy.next;
    }
}














































