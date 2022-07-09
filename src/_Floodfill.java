import java.util.Arrays;

public class _Floodfill {



    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor=image[sr][sc];
        if(color!=image[sr][sc])
            changeColor(image,sr,sc,color,oldColor);
        return image;
    }


    public static void changeColor(int[][] image, int r, int c, int color, int oldColor){

        if(image[r][c]==oldColor) {
            image[r][c] = color;
            if(r>=1)
                changeColor(image, r - 1, c, color, oldColor);
            if(c>=1)
                changeColor(image, r, c - 1, color, oldColor);
            if(r<image.length-1)
                changeColor(image, r + 1, c, color, oldColor);
            if(c<image[0].length-1)
                changeColor(image, r, c + 1, color, oldColor);
        }
    }

    public static void main(String[] args) {
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.toString(floodFill(image,1,1,2)));
    }






}
