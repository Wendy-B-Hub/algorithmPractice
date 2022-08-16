/*
package solutions;

import utils.print;

import java.util.*;

public class hard239 {
    public static void main(String[] args) {
//        int[] ans=maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
//        int[] ans=maxSlidingWindow(new int[]{1},1);
        int[] ans=maxSlidingWindow1(new int[]{7,2,4},2);
        System.out.println(ans.length);
        print.printOneDimension(ans);
    }

*/
/*    public static int[] maxSlidingWindow(int[] nums, int k) {
        int left=0,right=0;
        List<Integer> que=new LinkedList<>();
        ArrayList<Integer>res=new ArrayList<>();
        while (right<nums.length){
            que.add(nums[right]);
            right++;
            if(que.size()==k){
                Integer x=que.get(0);
                Collections.sort(que);
                res.add(que.get(k-1));
                que.remove(x);
                System.out.println(que);
                left++;
            }
        }
        Integer[] integers = res.toArray(new Integer[res.size()]);
        int[] ans=Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
        return ans;
    }*//*


    //超时
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        List<Integer> res=new LinkedList<>();
        for(int i=0;i<=nums.length-k;i++){
            int maxl=Integer.MIN_VALUE;
            int cnt=0;
            while (cnt<k){
                maxl=Math.max(nums[cnt+i],maxl);
                cnt++;
                System.out.println(cnt);
            }
            res.add(maxl);
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }

}






















*/
