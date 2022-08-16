package nopart;

public class easy387_hash {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int[] abc=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=c-'a';
            abc[idx]++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=c-'a';
            if(abc[idx]==1)return i;
        }
        return -1;
    }
}
