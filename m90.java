package solutions.permute;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m90 {
    static List<List<Integer>>res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static void main(String[] args) {
        subsetsWithDup(new int[]{1,2,2});
        System.out.println(res);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        // 先排序，让相同的元素靠在一起
        Arrays.sort(nums);
        back(nums,0);
        return res;

    }

    public static void back(int[] nums,int start){
        res.add(new LinkedList<>(path));
        for (int i=start;i< nums.length;i++){
            // 剪枝逻辑，值相同的相邻树枝，只遍历第一条
            if(i!=0&&i>start&&nums[i]==nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            back(nums,i+1);
            path.removeLast();
        }
    }
}
