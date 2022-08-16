package palindrome;


//超过时间限制

public class m5 {
    public static void main(String[] args) {
        //test isPalindrome:
        String s="ac";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);

        //test longestPalindrome:
        String ss="cbbd";
        String s1 = longestPalindrome(ss);
        System.out.println(s1);
    }

    public static String longestPalindrome(String s) {
        String ans="";
        int len=s.length();
        if (len==0||len==1)return s;
        for(int i=0;i<len;i++){
            int step=1;
            while (step+i<=len){
                String substring = s.substring(i, i + step);
                boolean isPalindrome = isPalindrome(substring);
                if(isPalindrome){
                    if(substring.length()>ans.length()){
                        ans=substring;
                    }
                }
                step++;
            }
        }
        return ans;
    }

/*    public static boolean isPalindrome(String s){
        int len=s.length();
        if(len==1||len==0)return true;
        if(len%2==0){                       //even length
            int left=len/2-1;
            int right=len/2;
            while (left>=0&&right<len){
                if (s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else return false;
            }
        }else{                       //odd length
            int mid=len/2;
            int left=mid-1;
            int right=mid+1;
            while (left>=0&&right<len){
                if (s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }else return false;
            }
        }
        return true;
    }*/

    public static boolean isPalindrome(String s){
        int len=s.length();
        if(len==1||len==0)return true;
        int left=0;
        int right=0;
        if(len%2==0){                       //even length
            left=len/2-1;
            right=len/2;
        }else{                       //odd length
            int mid=len/2;
            left=mid-1;
            right=mid+1;
        }
        while (left>=0&&right<len){
            if (s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }else break;
        }
        return true;
    }
}






















