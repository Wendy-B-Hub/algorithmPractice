package nopart;

public class easy28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(contains(haystack, needle, 1));
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len1<len2)return -1;
        if(needle==null || len2==0)return 0;  //当 needle 是空字符串时我们应当返回 0

        for(int i=0;i<len1-len2+1;i++){  //todo
            if(contains(haystack,needle,i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String str1,String str2,int start){
        int idx1=start;
        int idx2=0;
        while (idx1<str1.length()&&idx2<str2.length()){
            if (str1.charAt(idx1)==str2.charAt(idx2)){
                idx1++;
                idx2++;
            }else return false;
        }
        return true;
    }

/*    public static boolean isSame(char[] charHaystack,char[] charNeedle,int start){
        int len=charNeedle.length;
        int idx=0;
        for(int i=start;i<charHaystack.length&&idx<len;i++){
            if(charNeedle[idx]!=charHaystack[i])return false;
            idx++;
        }
        return true;
    }*/

}










































































