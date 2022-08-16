package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class m200_v2 {
    public static void main(String[] args) {
        char[] list1=new char[]{'1','1','1'};
        char[] list2=new char[]{'0','1','0'};
        char[] list3=new char[]{'1','1','1'};
        char[][] grid=new char[][]{list1,list2,list3};
        int res = numIslands(grid);
        System.out.println(res);
    }

    public static int numIslands(char[][] grid) {
        int num=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1'){
                    System.out.printf("i=%d,j=%d\n",i,j);
                    bfs(grid,i,j);
                    num++;
                }
            }
            System.out.println();
        }
        return num;
    }

    public static void bfs(char[][] grid,int i,int j){
        Queue<Integer> que=new LinkedList();
        int colNum=grid[0].length;
        int rowNum=grid.length;
        que.offer(i*colNum+j);  //方便后续计算i，j.----->java中没有pair对值表示，
        grid[i][j]='2';
        while (!que.isEmpty()){
            int tmp = (int)que.remove();
            int row=tmp/colNum;
            int col=tmp%colNum;
            System.out.printf("row=%d,col=%d\n",row,col);

            if(row+1<rowNum&&grid[row+1][col]=='1'){  //down
                grid[row+1][col]='2';
                que.offer((row+1)*colNum+col);
            }
            if(row-1>=0&&grid[row-1][col]=='1'){  //up row-1>=0 '=0'
                grid[row-1][col]='2';
                que.offer((row-1)*colNum+col);
            }
            if(col-1>=0&&grid[row][col-1]=='1'){  //left
                grid[row][col-1]='2';
                que.offer((row)*colNum+col-1);
            }
            if(col+1<colNum&&grid[row][col+1]=='1'){  //right
                grid[row][col+1]='2';
                que.offer((row)*colNum+col+1);
            }
        }
    }



}























