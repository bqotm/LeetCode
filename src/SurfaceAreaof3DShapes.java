public class SurfaceAreaof3DShapes {



    public int surfaceArea(int[][] grid) {

        int n=grid.length;
        int surface=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0)
                    surface=S(grid[0][0]);
                else{
                    if(i==0)
                        surface+=S(grid[i][j])-2*Math.min(grid[i][j], grid[i][j-1]);
                    else if(j==0)
                        surface+=S(grid[i][j])-2*Math.min(grid[i-1][j], grid[i][j]);
                    else
                        surface+=S(grid[i][j])-2*(Math.min(grid[i-1][j], grid[i][j])+Math.min(grid[i][j], grid[i][j-1]));
                }
            }
        }

        return surface;
    }

    public int S(int x){
        if(x==0)
            return 0;
        return 4*x+2;
    }


}
