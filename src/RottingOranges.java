import java.util.*;

public class RottingOranges {

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        int rotten=0;
        if(m==0 || n==0)
            return 0;
        Queue<Pair> queue=new LinkedList<>();
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==2)
                    queue.add(new Pair(i, j));
                if(grid[i][j]==1)
                    fresh++;

            }
        }
        if(fresh==0)    return 0;
        int[] coord={0,1,1,0,0,-1,-1,0};
        while(!queue.isEmpty()) {
            int s=queue.size();
            for(int i=0; i<s; i++){
                Pair pair=queue.poll();
                for(int k=0; k<coord.length-1; k+=2){
                    int a= pair.x+coord[k];
                    int b= pair.y+coord[k+1];
                    if(a<0 || b<0 || a>=m || b>=n || grid[a][b]==0 || grid[a][b]==2)
                        continue;
                    grid[a][b]=2;
                    queue.add(new Pair(a,b));
                    fresh--;
                }
            }
            rotten++;
        }
        System.out.println(rotten+" "+fresh);
        return fresh==0 ? rotten-1 : -1;
    }




    public static void main(String[] args) {
        int[][] grid={{2, 1, 1},{1, 1, 0},{0, 1, 1}};
        orangesRotting(grid);
        for(int[] row: grid){
            System.out.println(Arrays.toString(row));
        }
    }




}
