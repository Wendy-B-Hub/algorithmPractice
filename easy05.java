package nopart;

public class easy05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                str.append(c);
            }else if(c==' '){
                str.append("%20");
            }
        }

        return str.toString();
    }

}


































