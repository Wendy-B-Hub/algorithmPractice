package solutions.permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m47 {
    static List<List<Integer>>res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static void main(String[] args) {
        permuteUnique(new int[]{1,1,2});
        System.out.println(res);
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        back(nums,used);
        return res;
    }

    public static void back(int[] nums,boolean[] used){
        if(nums.length==path.size()){
//            System.out.println(path);
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1] &&used[i-1]==true)continue;
            // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置,
            // nums = [1,2,2'] 这个例子，我保持排列中 2 一直在 2' 前面
                //标准全排列算法之所以出现重复，
                // 是因为把相同元素形成的排列序列视为不同的序列，
                // 但实际上它们应该是相同的；而如果固定相同元素形成的序列顺序，
                // 当然就避免了重复。
            //当出现重复元素时，比如输入 nums = [1,2,2',2'']，2' 只有在 2 已经被使用的情况下才会被选择，同理，2'' 只有在 2' 已经被使用的情况下才会被选择，这就保证了相同元素在排列中的相对位置保证固定。
            used[i]=true;
            path.add(nums[i]);
            System.out.println(path);
            back(nums,used);
            path.removeLast();
            used[i]=false;
        }
    }
}
