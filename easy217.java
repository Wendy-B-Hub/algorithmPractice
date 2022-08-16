package solutions.hash;

import java.util.HashMap;

public class easy217 {
    public static void main(String[] args) {
        boolean ans=containsDuplicate(new int[]{1,2,3,1});
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))return true;
            map.put(nums[i],1);
        }
        return false;
    }
}
