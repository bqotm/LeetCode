public class IslandPerimeter {


        /*
        grid[i][j]=1 repersents land
        grid[i][j]=0 water
         */


    public int islandPerimeter(int[][] grid) {

        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0; i< grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    return perimeter(grid, i, j, visited);

                }
            }
        }
        return 0;
    }

    public int perimeter(int[][] grid, int i, int j, boolean[][] visited){

        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j]==0)
            return 1;
        int s=0;
        if(grid[i][j]==1 && !visited[i][j]){
                visited[i][j]=true;
                s+=perimeter(grid, i, j-1, visited);
                s+=perimeter(grid, i-1, j , visited);
                s+=perimeter(grid, i, j+1 , visited);
                s+=perimeter(grid, i+1, j , visited);
        }
        return s;
    }

    public static void main(String[] args) {
        int[][] grid={{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        IslandPerimeter landPerimeter=new IslandPerimeter();
        System.out.println(landPerimeter.islandPerimeter(grid));
    }

}

