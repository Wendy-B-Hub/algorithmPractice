package nopart;

public class easy58 {
    public static void main(String[] args) {
        String s = "lrloseumgh";
             int   k = 6;
        reverseLeftWords(s,k);
    }
    public static String reverseLeftWords(String s, int n) {
        int len=s.length();
        String str1 = s.substring(0, n);
        String str2 = s.substring(n,len);
        StringBuilder sb=new StringBuilder();
        sb.append(str2);
        sb.append(str1);
        return sb.toString();
    }

}
