package solutions;

import utils.LinkListNode;
import utils.ListNode;

public class m2 {
    public static void main(String[] args) {
        ListNode list1 = LinkListNode.buildListNode(new int[]{9,9,9,9,9,9,9});
        ListNode list2 = LinkListNode.buildListNode(new int[]{9,9,9,9});
        ListNode res = addTwoNumbers(list1, list2);
        LinkListNode.printListNode(res);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=new ListNode(-1);
        ListNode dummy=p;
        int cnt=0;
        while (l1!=null || l2!=null || cnt!=0){
            int val1=0,val2=0;
            if(l1!=null && l2!=null){   //都不为空
                val1=l1.val;
                val2=l2.val;
                l1=l1.next;
                l2=l2.next;
            }else if(l1==null && l2!=null){   //l1为空，l2不为空
                val2=l2.val;
                l2=l2.next;
            }else if(l1!=null && l2==null){  //l1不为空，l2为空
                val1=l1.val;
                l1=l1.next;
            }
            int sum=val1+val2+cnt;
            cnt=sum/10;
            int val=sum%10;
            p.next=new ListNode(val);
            p=p.next;
        }
        return dummy.next;
    }
}












































