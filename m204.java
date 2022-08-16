package solutions;

public class m204 {

    public static void main(String[] args) {
        System.out.println(countPrimes(1));
    }

    public static int countPrimes(int n) {
        if(n<2)return 0;
        int cnt=0;
        int[] flag=new int[n];
        for(int i=2;i<n;i++){
            if(flag[i]==0)cnt++;
            for(int j=i;j<n;j+=i){
                flag[j]=1;
            }
        }
        return cnt;
    }
}










































































