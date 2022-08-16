package nopart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class easy387 {
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,int[]> map=new HashMap<>();  //[firstIndex,cnt]
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                int[] vals = map.get(c);
                vals[1]+=1;
                map.put(c,vals);
            }else{
                int[] tmp=new int[]{i,1};
                map.put(c,tmp);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(char c:map.keySet()){
            int[] test=map.get(c);
            if(test[1]==1){
                list.add(test[0]);
            }
        }

        if(list.size()==0)return -1;

        Collections.sort(list);

       return list.get(0);
    }

}























