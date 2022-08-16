package solutions;

import utils.TreeNode;
import utils.makeTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class m199 {
    static List<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        int[] preorder=new int[]{1,2};
        int[] inorder=new int[]{1,2};
        TreeNode root = makeTree.buildTree(preorder, inorder);
        makeTree.printLevelTree(root);
        rightSideView(root);
        System.out.println(list);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()){
            int len=que.size();
            while (len>0){                  //每一层进行清空处理
                TreeNode poll = que.poll();
                if(len==1){list.add(poll.val);}   //从往左往右加，那么清空时只剩下最后一位时，一定是右边看见的。
                if(poll.left!=null){
                    que.offer(poll.left);
                }
                if(poll.right!=null){
                    que.offer(poll.right);
                }
                len--;
            }
        }
        return list;
    }

}
