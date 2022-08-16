package nopart;

public class easy459 {
    public static void main(String[] args) {
        boolean flag = repeatedSubstringPattern("abcabcabcabc");
        System.out.println(flag);
    }

    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.append(s);
        sb= new StringBuilder(sb.substring(1, sb.length() - 1));
        String str=sb.toString();
        return str.contains(s);
    }

}





































