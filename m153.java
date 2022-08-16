package solution;

public class m153 {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{11,13,15,17}));
    }

    public static int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]){   //判断哪边是有序的
                left=mid+1;
                //left=mid+1:将范围缩小到无序的那一半，因为答案就在那一半。
                // 之所以要+1，是因为mid肯定不是最小的那个，
                // 至少nums[right]比nums[mid]更小
            }else {
                right=mid;
                //right=mid:这里直接取mid，因为此时mid的左边（包含）是不完全有序的那一半，
                // mid有可能直接是最小值，所以要取mid
            }
        }
        return nums[left];
    }
/*    public static int findMin(int[] nums) {
        if (nums.length==0 || nums==null)return 0;
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[left]<nums[mid] && nums[mid]>nums[right]){      //[3,4,5,1,2]
                left=mid;
            }else if(nums[left]>nums[mid] && nums[mid]<nums[right]){   //[4,5,1,2,3]
                right=mid;
            }else if(right-left==1&&nums[left]>nums[right]){             //[5,1]
                return nums[right];
            }else if(right-left==1&&nums[left]<nums[right]){   //[1,5]
                return nums[left];
            }else return nums[left];
        }
        return nums[0];
    }*/

}
