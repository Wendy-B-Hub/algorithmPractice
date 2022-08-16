package solutions;

import utils.LinkListNode;
import utils.ListNode;

public class hard23 {
    public static void main(String[] args) {
/*        ListNode list1=null;
        ListNode list2 = LinkListNode.buildListNode(new int[]{1, 4, 5});
        ListNode ans = mergeTwoLists(list1, list2);
        LinkListNode.printListNode(ans);*/
        ListNode list1 = LinkListNode.buildListNode(new int[]{1, 4, 5});
        ListNode list2 = LinkListNode.buildListNode(new int[]{1, 3, 4});
        ListNode list3 = LinkListNode.buildListNode(new int[]{2,6});
        ListNode[] lists=new ListNode[]{list1,list2,list3};
        ListNode listNode = mergeKLists(lists);
        LinkListNode.printListNode(listNode);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
//        ListNode dummy=new ListNode();
        ListNode ans=null;
        for(int i=0;i<lists.length;i++){
            ans= mergeTwoLists(lists[i], ans);
        }
        return ans;
    }

    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode p=new ListNode(-1);
        ListNode dummy=p;
        while (list1!=null || list2!=null){
            if(list1!=null&&list2!=null){
                if(list1.val<=list2.val){
                    p.next=list1;
                    list1=list1.next;
                }else{
                    p.next=list2;
                    list2=list2.next;
                }
            }else if (list1!=null&&list2==null){
                p.next=list1;
                list1=list1.next;
            }else if(list1==null&&list2!=null){
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
        }
        return dummy.next;
    }

}











































































