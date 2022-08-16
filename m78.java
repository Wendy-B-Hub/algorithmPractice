package day1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class m78 {
    static List<List<Integer>> res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> subsets = subsets(nums);
        for (List sub:subsets){
            System.out.println(sub);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }
    public static void backtrack(int[] nums,int start){
        res.add(new ArrayList<>(path));   // 收集子集，要放在终止添加的上面，否则会漏掉自己
        System.out.println("res: "+res);
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            System.out.println("after add : path: "+path);
            backtrack(nums,i+1);
            path.removeLast();
            System.out.println("after remove : path: "+path);
        }
    }
}















































