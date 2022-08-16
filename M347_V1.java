package solutions;

import utils.print;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class M347_V1 {
    public static void main(String[] args) {
        int[] ints = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        print.printOneDimension(ints);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>que
                =new PriorityQueue<>((o1,o2)->Integer.compare(o1.getValue(),o2.getValue()));

        for(Map.Entry<Integer,Integer>entry: mp.entrySet()){
            que.offer(entry);
        }
        while (que.size()>k){
                que.poll();
        }
        int[] res=new int[k];
        for (int i=k-1;i>=0;i--){
            res[i]=(int)que.poll().getKey();
        }
        return res;
    }
}
