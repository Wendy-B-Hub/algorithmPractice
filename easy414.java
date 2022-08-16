package solutions;

import java.util.*;
import java.util.stream.IntStream;

public class easy414 {

    public static void main(String[] args) {
        int num = thirdMaxTreeMap(new int[]{2,2,3,1});
        System.out.println("thirdMaxTreeMap： "+num);

        System.out.println("thirdMaxTreeSet："+thirdMaxTreeSet(new int[]{2,2,3,1}));


        System.out.println("thirdMaxSortInteger："+thirdMaxSortInteger(new int[]{2,2,3,1}));

        System.out.println("thirdMaxLinear： "+thirdMaxLinear(new int[]{2, 2, 3, 1}));
    }


    public static int thirdMaxTreeMap(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                map.put(nums[i],val+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int cnt=0;
        int ans=0;
        for(Integer key:map.keySet()){
            cnt++;
            if (cnt==3) return key;
            if (cnt==1) ans=key;
        }
        return ans;
    }

    public static int thirdMaxTreeSet(int[] nums) {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> set=new TreeSet<>(com);
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()>=3){
            set.pollFirst();
            set.pollFirst();
            int ans = (int)set.pollFirst();
            return ans;
        }else return (int)set.pollFirst();
    }

    public static int thirdMaxLinear(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=nums.length-1;i>=0;i--){
            if(i!= nums.length-1 && nums[i]==nums[i+1] ){
                //  i!= nums.length-1 一定放在第一位，否则会有outOfBound异常
                continue;
            }
            cnt++;
            if(cnt==3)return nums[i];
        }
        if(cnt<3)return nums[nums.length-1];
        return -1;
    }


        public static int thirdMaxSortInteger(int[] nums){   //not AC
        nums=IntStream.of(nums)
                .boxed()
                .sorted(((o1, o2) -> o2-o1))          //溢出    [-2147483648,1,1]
                .mapToInt(Integer::intValue)
                .toArray();
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            else cnt++;
            if(cnt==3)return nums[i];
        }
        if(cnt<3)return nums[0];
        return -1;
    }
}









