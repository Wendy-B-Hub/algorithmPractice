package solutions;

import utils.ListNode;

import java.util.HashMap;

public class m142 {
    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Boolean>map=new HashMap<>();
        while (head!=null){
            if(map.containsKey(head))return head;
            map.put(head,true);
            head=head.next;
        }
        return null;
    }
}
