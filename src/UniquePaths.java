import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniquePaths {

    class Pair {
        int x, y;
        public Pair(){}
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
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

    public int uniquePaths(int m, int n) {
        Map<Pair, Integer> map= new HashMap<>();
        return cache(m, n, map);

    }

    public int cache(int m, int n, Map<Pair, Integer> mem){
        Pair pair=new Pair(m, n);
        if(mem.containsKey(pair))
            return mem.get(pair);
        if(m==1 && n==1)    return 1;
        if(m==0 || n==0)    return 0;
        mem.put(pair, cache(m-1, n, mem)+cache(m, n-1, mem));
        return mem.get(pair);
    }

    public int _uniquePaths(int m, int n) {
        int[][] mem=new int[m+1][n+1];
        return cache(m, n, mem);

    }

    public int cache(int m, int n, int[][] mem){
        if(mem[m][n]!=0)
            return mem[m][n];
        if(m==1 && n==1)    return 1;
        if(m==0 || n==0)    return 0;
        mem[m][n]=cache(m-1, n, mem)+cache(m, n-1, mem);
        return mem[m][n];
    }
}
