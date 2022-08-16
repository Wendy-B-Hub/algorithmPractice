package palindrome;

public class m8_v2 {
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }

    public static int myAtoi(String s) {
        String str=s.trim();
        if(str.length()==0 || str==null)return 0;
        int sign=1;
        int idx=0;
        char c=str.charAt(0);
        if(c=='+'){
            sign=1;
            idx++;
        }else if(c=='-'){
            sign=-1;
            idx++;
        }
        long sum=0;
        for(int i=idx;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i)))break;
            sum=sum*10+str.charAt(i)-'0';
            if(sign==1&&sum>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&sum*(-1)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) (sign*sum);
    }
}



















