package solutions;

import utils.print;

import java.util.ArrayList;

public class m238 {
    public static void main(String[] args) {
        int[] nums=new int[]{-1,1,0,-3,3};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums.length==1 || nums==null)return nums;
        int prefix=1;
        int postfix=1;
        int n= nums.length;
        int[] res=new int[n];

        //prefix array:
        for(int i=0;i<n;i++){
            if(i==0){
               res[0]=prefix;
            }else {
                res[i]=prefix*nums[i-1];
            }
            prefix=res[i];
        }

        //postfix array:
        int[] ans=new int[n];
        for(int j=n-1;j>=0;j--){
            if(j==n-1){
                ans[j]=postfix;
            }else {
                ans[j]=nums[j+1]*postfix;
            }
            res[j]=res[j]*ans[j];  //----->calculate the result
            postfix=ans[j];
        }
/*        System.out.println("post");
        print.printOneDimension(ans);
        System.out.println("prefix");
        print.printOneDimension(res);*/
        return res;
    }
}



































