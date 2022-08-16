package nopart;

import java.util.ArrayList;

public class m151_original {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String str=s.trim();
        if(str==null || str.length()==0) return str;

        //1.extract every word

        ArrayList<StringBuilder> list=new ArrayList<>();
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                builder.append(c);
            }else if(c==' '){
                if (builder!=null && builder.length()!=0){
                    list.add(builder);
                    builder=new StringBuilder();;     //builder=""
                }
            }
        }
        if(builder!=null&&builder.length()!=0) list.add(builder);  //extract the last word

        if(list.size()==1)return list.get(0).toString();   //if there is only one word

        //2.reverse the list
        reverseList(list);

        System.out.println(list);

        //3. make it a string and return
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<list.size()-1;i++){
            sb.append(list.get(i));
            sb.append(" ");
        }
        sb.append(list.get(list.size()-1));

        return sb.toString();
    }

    public static void reverseList(ArrayList<StringBuilder> list){
        int left=0;
        int right=list.size()-1;
        while (left<right){
            StringBuilder strL=list.get(left);
            StringBuilder strR=list.get(right);
            list.set(left,strR);
            list.set(right,strL);
            left++;
            right--;
        }
    }
}
