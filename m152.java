package solution;



public class m152 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-3,-1,-1}));
    }

    //乘以当前元素以后的最大乘积，需要记录最大乘积，
    // 也要记录最小乘积，因为最小值可能翻身变最大值。
    public static int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int curMax=1;
        int curMin=1;
        for (int i=0;i< nums.length;i++){
            int tmp1=curMax*nums[i];
            int tmp2=curMin*nums[i];
            curMax=Math.max(nums[i],Math.max(tmp1,tmp2));  //[-1,8]
            curMin=Math.min(nums[i],Math.min(tmp1,tmp2));  //[-1,-8]
           res=Math.max(res,Math.max(curMax,curMin));
        }
        return res;
    }
}















