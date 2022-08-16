package solutions.permute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class m39 {
    static List<List<Integer>>res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    static int sum=0;
    public static void main(String[] args) {
        combinationSum(new int[]{2},1);
        System.out.println(res);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates,target,0);
        return res;
    }

    public static void back(int[] candidates,int target,int start){
        if(sum==target){
            res.add(new LinkedList<>(path));
            return;
        }
        if(sum>target)return;
        for(int i=start;i<candidates.length;i++){  //重复使用自身的元素，而不是从头开始取
            path.add(candidates[i]);
            sum+=candidates[i];
            back(candidates,target,i);
            path.removeLast();
            sum-=candidates[i];
        }
    }
}
