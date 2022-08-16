package solutions;

public class easy27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

/*    public static int removeElement(int[] nums, int val) {
        int slow=0;  //慢指针：指向更新 新数组下标的位置
        int fast=0;  //快指针：寻找新数组的元素 ，新数组就是不含有目标元素的数组
        for(fast=0;fast<nums.length;fast++){
            if(nums[fast]==val){
                continue;
            }else {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        for(int i=0;i< nums.length;i++) System.out.print(nums[i]+" ");
        return nums.length-(fast-slow);   //fast-slow 为数组中=val的值有几个
    }*/

    public static int removeElement(int[] nums, int val) {
        int fast=0;
        int slow=0;
        while (fast< nums.length){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;   //slow数组是不含有val值的
                //注意这里和有序数组去重的解法有一个细节差异，
                // 我们这里是先给 nums[slow] 赋值然后再给 slow++，
                // 这样可以保证 nums[0..slow-1] 是不包含值为 val 的元素的，
                // 最后的结果数组长度就是 slow。
            }
             fast++;
        }
        return slow;
    }
}





































