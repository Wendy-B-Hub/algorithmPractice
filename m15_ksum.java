package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m15_ksum {

    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length<3)return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            int target=-nums[i];
            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum>target)right--;
                else if(sum<target)left++;
                else if(sum==target){
                    ArrayList<Integer> path=new ArrayList<>();
                    path.add(nums[left]);
                    path.add(nums[right]);
                    path.add(nums[i]);
                    if(!list.contains(path)){
                        list.add(new ArrayList<>(path));
                    }
                    right--;
                    left++;
                }
            }
        }
        return list;
    }
}









































