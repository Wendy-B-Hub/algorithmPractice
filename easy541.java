package nopart;

public class easy541 {
    public static void main(String[] args) {
        String str="abcdefg";
        String s = reverseStr(str, 2);
        System.out.println(s);
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i=0;i<s.length();i+=2*k){
            int start=i,end=Math.min(chars.length-1,i+k-1);
            reverse(chars,start,end);
        }
        return String.valueOf(chars);
    }

    public static void reverse(char[] chars,int l,int r){
        while (l<r){
            char tmpl=chars[l];
            char tmpr=chars[r];
            chars[l]=tmpr;
            chars[r]=tmpl;
            l++;
            r--;
        }
    }
}
