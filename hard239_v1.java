package solutions;

import utils.print;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class MyQue{
    public Deque<Integer>deque=new LinkedList<>();
    public MyQue(){}
    public void pop(int val){
        if(!deque.isEmpty()){
            int x=deque.peekFirst();
            if(x==val){
                deque.pollFirst();
            }
        }
    }

    public void push(int val){
        while (!deque.isEmpty()&&val>(int)deque.peekLast()){
            deque.pollLast();
        }
        deque.add(val);   //todo add  ?  push
    }

    public int front(){
        int x=(int)deque.peekFirst();
        System.out.println(x);
        return x;
    }
}
public class hard239_v1 {
    public static void main(String[] args) {
        int[] ans=maxSlidingWindow(new int[]{7,2,4},2);
        print.printOneDimension(ans);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        MyQue que=new MyQue();
        LinkedList<Integer>list=new LinkedList<>();
        for(int i=0;i<k;i++){
            que.push(nums[i]);
        }
        list.add(que.front());
        System.out.println(list);
        for (int i=k;i<nums.length;i++){
            que.push(nums[i]);
            que.pop(nums[i-k]);
            list.add(que.front());
        }
        Integer[] integers = list.toArray(new Integer[list.size()]);
        int[] ans= Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
        return ans;
    }
}




















