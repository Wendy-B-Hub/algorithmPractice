package solutions.permute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class per {
   static List<List<Integer>>list=new ArrayList<>();
    static LinkedList<Integer>path=new LinkedList<>();
    public static void main(String[] args) {
        print(new int[]{1,2});
    }

    public static void print(int[] nums){
        back(nums);
        System.out.println(list);
    }

    public static void back(int[] nums){
        if(path.size()==2){
            list.add(new LinkedList<>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            path.add(nums[i]);
            back(nums);
            path.removeLast();
        }
    }
}















