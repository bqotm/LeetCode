public class ReshapeTheMatrix {



    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c!=m*n)
            return mat;
        int[][] res=new int[r][c];
        int y=0,x=0;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                if(y==n){
                    x++;
                    y=0;
                }
                res[i][j]=mat[x][y];
                y++;
            }
        }
        return res;
    }





}
