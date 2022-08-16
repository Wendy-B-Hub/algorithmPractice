package day1;

import org.junit.Test;

public class m167 {
    @Test
    public void test1(){
        int[] nums=new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 9);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int i=0,j=len-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else if(sum==target){
                break;
            }
        }
        int[] nums=new int[]{i+1,j+1};
        return nums;
    }
}














































