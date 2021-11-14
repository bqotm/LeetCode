public class Searcha2DMatrix {




    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int x=0, y=matrix[0].length-1;
        int i=0;
        while(target>matrix[i][y]){
            i++;
            if(i>=m)
                return false;
        }
        while (x<=y){
            int middle=x+(y-x)/2;
            if(matrix[i][middle]>target){
                y=middle-1;
            }
            else if(matrix[i][middle]<target){
                x=middle+1;
            } else {
                return true;
            }
        }
        return false;
    }

}
