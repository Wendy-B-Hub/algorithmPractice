package solutions;

import utils.LinkListNode;
import utils.ListNode;


public class hard23_v1 {
    public static void main(String[] args) {
        ListNode node = LinkListNode.buildListNode(new int[]{1, 4, 5});
        ListNode node1 = LinkListNode.buildListNode(new int[]{1, 3, 4});
        ListNode node2 = LinkListNode.buildListNode(new int[]{2, 6});
//        ListNode[] lists=new ListNode[]{node,node1,node2};
        ListNode[] lists=new ListNode[]{};
        ListNode ans = mergeKLists(lists);
        LinkListNode.printListNode(ans);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=null;
        for(int i=0;i<lists.length;i++){
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB){
        ListNode node=new ListNode(-1);
        ListNode dummy=node;
        while (headA!=null || headB!=null){
            if(headA!=null&&headB!=null){
                int valA=headA.val;
                int valB=headB.val;
                if(valA<=valB){
                    node.next=new ListNode(valA);
                    node=node.next;
                    headA=headA.next;
                }else {
                    node.next=new ListNode(valB);
                    node=node.next;
                    headB=headB.next;
                }
            }else if(headA==null&& headB!=null){
                node.next=new ListNode(headB.val);
                node=node.next;
                headB=headB.next;
            }else if (headA!=null&& headB==null){
                node.next=new ListNode(headA.val);
                node=node.next;
                headA=headA.next;
            }
        }
        return dummy.next;
    }
}


















































