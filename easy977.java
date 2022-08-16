package solutions;

import utils.print;

import java.util.Arrays;
import java.util.HashMap;

public class easy977 {
    public static void main(String[] args) {
        int[] ints = sortedSquares(new int[]{1});
        print.printOneDimension(ints);
    }

//    O(N)+O(nlogn)
    public static int[] sortedSquares(int[] nums) {
        for (int i=0;i<nums.length;i++){
            int val=nums[i];
            int sqaure=val*val;
            nums[i]=sqaure;  //assign
        }
        Arrays.sort(nums);
        return nums;
    }

    //合并两个有序数组，以空间换时间
    //O(n)
    public static int[] sortedSquares1(int[] nums) {   //[-5.-2,-1]
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] res = new int[n];
        int p = n - 1;
        while (left <=right) {   //中间那个数也要加进去
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[p] = nums[right] * nums[right];
                right--;
            } else {
                res[p] = nums[left] * nums[left];
                left++;
            }
            p--;
        }
        return res;
    }

}
