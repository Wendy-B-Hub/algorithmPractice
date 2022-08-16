package solutions.hash;

import utils.print;

import java.util.*;

public class m347 {
    public static void main(String[] args) {
        int[] ans=topKFrequent(new int[]{1,1,1,2,2,3},2);
        print.printOneDimension(ans);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                int val = (int) mp.get(nums[i]);
                mp.put(nums[i], val + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = mp.entrySet();
        PriorityQueue<Map.Entry<Integer,Integer>>que=new PriorityQueue<>(
                        (O1,O2)->O1.getValue().compareTo(O2.getValue()));

        for(Map.Entry<Integer,Integer> entry:entries){
            que.offer(entry);
        }

        while (que.size()>k){
            que.poll();
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            System.out.println(que.peek());
            res[i]=(int)que.poll().getKey();
        }
        return res;
    }
  /* public static int[] topKFrequent(int[] nums, int k) {
       int[] result = new int[k];
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }

       Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
       // 根据map的value值正序排，相当于一个小顶堆
       PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
       for (Map.Entry<Integer, Integer> entry : entries) {
           queue.offer(entry);
           if (queue.size() > k) {
               queue.poll();
           }
       }
       for (int i = k - 1; i >= 0; i--) {
           result[i] = queue.poll().getKey();
       }
       return result;
   }*/
}























