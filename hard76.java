package nopart;

import java.util.HashMap;

public class hard76 {
    public static void main(String[] args) {
//        String  ans=minWindow("ADOBECODEBANC","ABC");
        String  ans=minWindow("a","aa");
        System.out.println(ans);
    }

    public static String minWindow(String s, String t) {
        HashMap<Character,Integer>window=new HashMap<>();
        HashMap<Character,Integer>need=new HashMap<>();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int start=0;
        int len=Integer.MAX_VALUE;
        int left=0,right=0;
        int valid=0;
        while (right<s.length()){
            char c=s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(need.get(c).equals(window.get(c))){
                    valid++;
                }
            }
            while (valid==need.size()){
                if(right-left<len){
                    len=right-left;
                    System.out.println(len);
                    start=left;
                }
                char d=s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;             //神来之笔，放在window.get(c)-1之前
                    }
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}
























