package palindrome;


public class m8 {
    public static void main(String[] args) {
        int i = myAtoi("    -42");
        System.out.println(i);
    }

    public static int myAtoi(String s) {
        int ans = 1;
        int dir = 1;
        StringBuilder num = new StringBuilder();
        int len = s.length();
        int count = 0;
        while (count < len) {
            if (s.charAt(0) == ' ') {    //1.replace '  '
                s = s.substring(1);
            } else if (s.charAt(0) == '0') {  //replace :begin with'0'
                s = s.substring(1);
            } else if (s.charAt(0) == '-') {   //negative or positive
                dir *= -1;
                s = s.substring(1);
            } else break;
        }


        System.out.println("dir:" +dir);
        //2.extract number
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(charSetContains(c)){
                num.append(c);
            }
        }

        //3.calculate it
        ans = Integer.parseInt(num.toString());

        //4. if out of bound
        for(int i=0;i<32;i++){
            if(ans<(1<<i)){
                break;
            }
            if(i==31){
                if(dir==-1){
                    return -1*(1<<31);
                }else return (1<<31)-1;
            }
        }
        return dir*ans;
    }

    public static boolean charSetContains(char c){
        char[] charSet=new char[]{'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<charSet.length;i++){
            if(c==charSet[i]){
                return true;
            }
        }
//        Map<Character,Integer> map=new HashMap<>();
//        map.put('0',0);
//        map.put('1',1);
//        map.put('2',2);
//        map.put('3',3);
//        map.put('4',4);
//        map.put('5',5);
//        map.put('7',7);
//        map.put('8',8);
//        map.put('9',9);
//        if(map.containsKey(c)){
//            return map.get(c);
//        }
        return false;
    }
}































