package solutions.permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m40 {
    static List<List<Integer>>res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    static int sum=0;
    public static void main(String[] args) {
        combinationSum2(new int[]{14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12,
        },27);
        System.out.println(res);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(candidates,0,target);
        return res;
    }
    public static void back(int[] candidates,int start,int target){
        if(sum==target){
            res.add(new LinkedList<>(path));
            return;
        }
        // base case，超过目标和，直接结束
        if (sum > target) {
            return;
        }
        for (int i=start;i< candidates.length;i++){
            // 剪枝逻辑，值相同的相邻树枝，只遍历第一条
            if(i>0&&i>start&&candidates[i]==candidates[i-1]){
                continue;
            }
            sum+=candidates[i];
            path.add(candidates[i]);
            back(candidates,i+1,target);
            path.removeLast();
            sum-=candidates[i];
        }
    }
}
