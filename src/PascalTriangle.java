import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static int f(int row, int col){
        int[][] C=new int[31][31];
        for(int i=0; i<=row; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0){
                    C[i][j]=1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
        }
        return C[row][col];
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> all=new ArrayList<>();
        int[][] C=new int[31][31];
        List<Integer> row=new ArrayList<Integer>();
        for(int i=0; i<=numRows; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0){
                    C[i][j]=1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
                row.add(C[i][j]);
            }
            all.add(row);
        }
        return all;
    }

    public List<Integer> getRow(int rowIndex) {
        int[][] C=new int[31][31];
        List<Integer> row =new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0){
                    C[i][j]=1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
                if(i==rowIndex)
                    row.add(C[i][j]);
            }
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(f(5,2));
    }
}
