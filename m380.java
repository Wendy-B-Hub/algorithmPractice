package solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class m380 {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
/*        System.out.println(obj.insert(1));  //true
        System.out.println(obj.remove(2));  //false
        System.out.println(obj.insert(2));  //true
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));  //true
        System.out.println(obj.insert(2));  //false
        System.out.println(obj.getRandom());*/

        System.out.println(obj.remove(0));
        System.out.println(obj.remove(0));
        System.out.println(obj.insert(0));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(0));
        System.out.println(obj.insert(0));
    }
}

class RandomizedSet {

    HashMap<Integer,Integer>map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();   //collect numbers , and return them randomly

    public RandomizedSet() {}

    public boolean insert(int val) {
        if(map.containsKey(val))return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        int idx=map.get(val);
        int size=list.size();
        int last=list.get(size-1);
        list.set(idx,last);
        list.remove(size-1);
        map.put(last, idx);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int size=list.size();
        int randomIdx =(int) Math.floor(Math.random() * size);
        return list.get(randomIdx);
    }
}