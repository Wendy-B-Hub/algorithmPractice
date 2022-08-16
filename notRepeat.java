package solutions.permute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class notRepeat {

    static List<List<Integer>>list=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static void main(String[] args) {
        print(new int[]{0,1});
    }

    public static void print(int[] nums){
        boolean[] used=new boolean[nums.length];
        back(nums,used);
        System.out.println(list);
    }

    public static void back(int[] nums,boolean[] used){
        if(path.size()==nums.length){
            System.out.println(path);
            list.add(new LinkedList<>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(used[i]==true)continue;    //同一个树枝上，则跳过
            path.add(nums[i]);
            used[i]=true;
            back(nums,used);
            path.removeLast();  //回溯
            used[i]=false;  //回溯
        }
    }
}















