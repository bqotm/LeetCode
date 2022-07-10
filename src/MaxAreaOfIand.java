public class MaxAreaOfIand {



    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int area=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(visited[i][j] || grid[i][j]==0)
                    continue;
                maxArea=Math.max(maxArea, islandArea(grid, i, j, visited));
            }
        }

        return maxArea;
    }

    public int islandArea(int[][] grid, int r, int c, boolean[][] visited) {
        int area=0;
        if(grid[r][c]==1 && !visited[r][c]){
            visited[r][c]=true;
            area++;
            if(r>=1)
                area+=islandArea(grid, r-1, c, visited);
            if(c>=1)
                area+=islandArea(grid, r, c-1, visited);
            if(r+1<grid.length)
                area+=islandArea(grid, r+1, c, visited);
            if(c+1<grid[0].length)
                area+=islandArea(grid, r, c+1, visited);
            return area;
        }
        return 0;
    }



}

