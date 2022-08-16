package solutions;

public class easy26 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int slow=0;
        int fast=0;
        while (fast<nums.length){
            if(nums[fast]!=nums[slow]){
                slow++;             //  //只要slow数组，相当于在nums的基础上，变成了无重复的slow数组
                nums[slow]=nums[fast];  //维护 nums[0..slow] 无重复
            }
            fast++;
        }
        return slow+1;
    }
}





