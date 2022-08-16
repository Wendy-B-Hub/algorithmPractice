package palindrome;

public class m8_v1_clearmy {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -33"));

    }

    public static int myAtoi(String s) {
        int ans=0;
        int dir=1;
        int count=0;
        int len=s.length();

        while (count<len){
            char c=s.charAt(0);
            if(c==' ' || c=='0' || c=='-'){
                s=s.substring(1);
                if(c=='-')dir*=-1;
            }else if (!charSetContains(c)){
                return 0;
            }
            count++;
        }

        StringBuilder num=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean flag = charSetContains(c);
            if(flag){num.append(c);}
        }

        ans=Integer.parseInt(num.toString());

        if(dir==-1){
            return ans > Integer.MIN_VALUE ? dir*ans: Integer.MIN_VALUE;
        }else return ans<Integer.MAX_VALUE ? ans:Integer.MAX_VALUE;

    }

    public static boolean charSetContains(char c) {
        char[] charSet = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < charSet.length; i++) {
            if (c == charSet[i]) {
                return true;
            }
        }
        return false;
    }
}
