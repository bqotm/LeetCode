import java.util.Arrays;

public class MaxAreaofIsland {




    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0; i< grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    max=Math.max(area(grid, i, j, visited), max);
                    for(boolean row[]: visited)
                        Arrays.fill(row, false);
                }
            }
        }
        return max;
    }

    public int area(int[][] grid, int i, int j, boolean[][] visited){

        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j]==0)
            return 0;
        int s=0;
        if(grid[i][j]==1 && !visited[i][j]){
            visited[i][j]=true;
            s++;
            s+=area(grid, i, j-1, visited);
            s+=area(grid, i-1, j , visited);
            s+=area(grid, i, j+1 , visited);
            s+=area(grid, i+1, j , visited);
        }
        return s;
    }


}
