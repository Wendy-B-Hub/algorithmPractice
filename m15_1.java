package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class m15_1 {
    static List<List<Integer>>res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    static int sum=0;
    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
        System.out.println(res);
        for(List list:res){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,3,0);
        return res;
    }

    public static void backtrack(int[] nums,int start,int count,int targetSum){
        if(path.size()==count){
            if(sum==targetSum){
                res.add(new ArrayList<>(path));
                return;
            }
            else return;
        }
        for(int i=start;i<nums.length;i++) {

            if (i > 0 && nums[i] == nums[i - 1] && i > start) {

                System.out.println("skip,i= "+i+" ,start= "+start);  //start表示层数，从第0层开始

                continue;
            }
            System.out.println("=================");
            sum += nums[i];
            path.add(nums[i]);
            System.out.println(path);
            backtrack(nums, i + 1, count, targetSum);
            sum -= nums[i];
            path.removeLast();
        }
    }
}


//class Solution {
//    LinkedList<Integer> path=new LinkedList<>();
//    List<List<Integer>> res=new ArrayList<>();
//    int sum=0;
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        backtrack(nums,0,3,0);
//        return res;
//    }
//    public void backtrack(int[] nums,int start,int count,int targetSum){
//        if(path.size()==3){
//            if(sum==targetSum){
//                res.add(new ArrayList<>(path));
//                return;
//            }else return;
//        }
//        for(int i=start;i<nums.length&&nums[i]+sum<=targetSum;i++){
//            if(i>0&&nums[i]==nums[i-1]&&i>start)continue;
//            sum+=nums[i];
//            path.add(nums[i]);
//            backtrack(nums, i+1, count, targetSum);
//            sum-=nums[i];
//            path.removeLast();
//        }
//    }
//}
