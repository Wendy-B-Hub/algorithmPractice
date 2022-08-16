package solution;

public class m53 {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length==0)return 0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=max>sum?max:sum;
            if (sum<=0){
                sum=0;    //如果sum为负数，则遇到当前的数nums[i]肯定是负的，那么直接从下一个开始。

            }
        }
        return max;
    }
}
