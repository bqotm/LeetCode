public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int sum=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(visited[i][j] || grid[i][j]=='0')
                    continue;
                sum+=paint(grid, i, j, visited);
            }
        }
        return sum;
    }

    public int paint(char[][] grid, int r, int c, boolean[][] visited){
        if(grid[r][c]=='1' && !visited[r][c]){
            visited[r][c]=true;
            if(r>=1)
                paint(grid ,r-1, c, visited);
            if(c>=1)
                paint(grid,r,c-1, visited);
            if(r+1< grid.length)
                paint(grid, r+1, c, visited);
            if(c+1<grid[0].length)
                paint(grid, r, c+1, visited);
        }
        return 1;
    }

}
