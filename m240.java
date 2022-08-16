package solutions;

public class m240 {
    public static void main(String[] args) {
        int[] num1=new int[]{1,4,7,11,15};
        int[] num2=new int[]{2,5,8,12,19};
        int[] num3=new int[]{3,6,9,16,22};
        int[] num4=new int[]{10,13,14,17,24};

        int[][] nums=new int[][]{num1,num2,num3,num4};

        System.out.println(searchMatrix(nums, 20));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int r=0;r<matrix.length;r++){
            int left=0;
            int right=matrix[0].length-1;
            while (left<=right){
                int mid=left+(right-left)/2;
                            /*使用(low+high)/2会有整数溢出的问题
                        （问题会出现在当low+high的结果大于表达式结果类型所能表示的最大值时，
                            这样，产生溢出后再/2是不会产生正确结果的，而low+((high-low)/2)
                            不存在这个问题*/
                if(matrix[r][mid]>target){
                    right=mid-1;
                }else if(matrix[r][mid]<target){
                    left=mid+1;
                }else if(matrix[r][mid]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)return false;
        for(int r=0;r<matrix.length;r++){
            int left=0;
            int right=matrix[0].length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                /*使用(low+high)/2会有整数溢出的问题
					（问题会出现在当low+high的结果大于表达式结果类型所能表示的最大值时，
						这样，产生溢出后再/2是不会产生正确结果的，而low+((high-low)/2)
							不存在这个问题*/
                int value=matrix[r][mid];
                if(value>target){          //继续在R[low..mid-1]中查找
                    right=mid-1;
                }else if(value<target){   //继续在R[mid+1..high]中查找
                    left=mid+1;
                }else if(value==target){
                    return true;
                }
            }
        }
        return false;
    }
}

























