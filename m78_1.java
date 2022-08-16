package day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class m78_1 {
    static LinkedList<Integer>path=new LinkedList<>();
    static List<List<Integer>>res=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> subsets = subsets(nums);
        subsets.forEach(System.out::println);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0);
        return res;
    }
    public static void backtrack(int[] nums,int start){
        res.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(nums,i+1);
            path.removeLast();
        }
    }
}














































