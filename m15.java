package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m15 {
    private static List<List<Integer>>res=new ArrayList<>();
    private static LinkedList<Integer>path=new LinkedList<>();
    static int sum=0;
    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
        for(List list:res){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        boolean[] used=new boolean[len];
        backtrack(nums,0,0,3,used);
        return res;
    }

    public static void backtrack(int[] nums,int start,int target,int count,boolean[] used){
        if(path.size()==count){
            if(sum==target){res.add(new ArrayList<>(path));}
            else return;  // 如果path.size() == k 但sum != targetSum 直接返回
        }
        for(int i=start;i<nums.length&&sum+nums[i]<=0;i++){
            if(i>0&&nums[i]==nums[i-1]&&i>start)continue;    //出现重复节点，同层的第一个节点已经被访问过，所以直接跳过
            sum+=nums[i];
            path.add(nums[i]);
            used[i]=true;
            backtrack(nums,i+1,target,count,used);
            sum-=nums[i];
            used[i]=false;
            path.removeLast();
        }
    }

}



















































