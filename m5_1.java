package palindrome;

public class m5_1 {
    public static void main(String[] args) {
        String s = longestPalindrome("babad");
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String ans="";
        int len=s.length();
        for (int i=0;i<len;i++){
            String str1 = Palindrome(s, i, i);   //Palindrome is odd length, i expanded
            String str2 = Palindrome(s, i, i + 1);  //Palindrome is even length,
            String str3 = str1.length() > str2.length() ? str1: str2;
            ans=str3.length()>ans.length()?str3:ans;
        }
        return ans;
    }

    public static String Palindrome(String s,int left,int right){
        String str="";
        int len=s.length();
        while (left>=0&&right<len){
            if (s.charAt(left)==s.charAt(right)){
                str=s.substring(left,right+1);
                left--;
                right++;
            }else break;
        }
        return str;
    }
}











