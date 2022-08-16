package solutions;

import utils.print;

public class m48 {
    public static void main(String[] args) {
        int[] num1=new int[]{5,1,9,11};
        int[] num2=new int[]{2,4,8,10};
        int[] num3=new int[]{13,3,6,7};
        int[] num4=new int[]{15,14,12,16};

        int[][] nums=new int[][]{num1,num2,num3,num4};

        rotate(nums);
        print.printTwoDimension(nums);
    }

    public static void rotate(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        while (left<right){
            for(int i=0;i<right-left;i++){
                int top=left;
                int bottom=right;

                //save the temp variable
                int topLeft=matrix[top][left+i];

                matrix[top][left+i]=matrix[bottom-i][left];

                matrix[bottom-i][left]=matrix[bottom][right-i];

                matrix[bottom][right-i]=matrix[top+i][right];

                matrix[top+i][right]=topLeft;
            }
            left++;
            right--;
        }
    }
}




























