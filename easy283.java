package solutions;

public class easy283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0});
    }

    public static void moveZeroes(int[] nums) {
        // **去除 nums 中的所有 0，返回不含 0 的数组长度
        int fast=0;
        int slow=0;
        while (fast<nums.length){
            if (nums[fast]!=0){      //1.我们想要的条件是什么，fast指标去满足
                nums[slow]=nums[fast];
                slow++;     //2.slow使我们想要的数组，里面不包含0元素。个数为slow个
            }
            fast++;
        }
        for(int k=slow;k<nums.length;k++){  //3.剩下的全都是被用过的，// 将 nums[slow..] 的元素赋值为 0
            nums[k]=0;
        }
        for (int i=0;i<nums.length;i++) System.out.print(nums[i]+" ");
    }
}


