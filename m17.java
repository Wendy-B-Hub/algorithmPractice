package solutions;

import java.util.ArrayList;
import java.util.List;

public class m17 {
    static String[] strs=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static StringBuilder sb=new StringBuilder();
    static List<String> list=new ArrayList<>();

    public static void main(String[] args) {
        String digits="378";
        letterCombinations(digits);
    }

    public static  List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)return list;
        back(digits,0);
        System.out.println(list);
        return list;
    }

    public static void back(String digits,int start){
        if(sb.length()==digits.length()){
            list.add(sb.toString());
            return;
        }
        for (int i=start;i<digits.length();i++){  // digits="23"
            char c= digits.charAt(i);  //'2'  '3'
            String str = strs[c-'0'];  //strs[2]--->"abc"
            for (int k=0;k<str.length();k++){
                sb.append(str.charAt(k));   //'a'  'b'  'c'
                back(digits,i+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}


















