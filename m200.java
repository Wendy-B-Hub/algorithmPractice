package bfs;

public class m200 {
    public static void main(String[] args) {
        char[] list1=new char[]{'1','1','0','0','0'};
        char[] list2=new char[]{'1','1','0','0','0'};
        char[] list3=new char[]{'0','0','1','0','0'};
        char[] list4=new char[]{'0','0','0','1','1'};
        char[][] grid=new char[][]{list1,list2,list3,list4};
        int res = numIslands(grid);
        System.out.println(res);
    }


    public static int numIslands(char[][] grid) {
        int isLandNum=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
               if (grid[i][j]=='1'){
                    bfs(grid,i,j);  //to mark connected island
                    isLandNum++;
                }
            }
            System.out.println("isLandNum: "+isLandNum);
            System.out.println();
        }
        return isLandNum;
    }

    public static void bfs(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||
                j<0||j>=grid[0].length||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';  //now 四面八方去递归
        bfs(grid,i-1,j);
        bfs(grid,i+1,j);
        bfs(grid,i,j-1);
        bfs(grid,i,j+1);
    }
}




























































