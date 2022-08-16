package nopart;

public class easy28_v1 {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length()<needle.length())return -1;
        if(needle.length()==0 || needle==null) return 0;

        for (int i=0;i<haystack.length();i++){
            String str1=haystack.substring(i,i+needle.length());
            boolean contains = str1.contains(needle);
            if(contains)return i;
        }
        return -1;
    }
}
