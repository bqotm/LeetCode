public class FloodFill {



    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int germ_color=image[sr][sc];
        if(germ_color!=newColor)
            paint(image, germ_color, sr, sc, newColor);
        return image;
    }

    public void paint(int[][] image,int color, int r, int c, int newColor){
        if(image[r][c]==color){
            image[r][c]=newColor;
            if(r>=1)
                paint(image, color ,r-1, c, newColor);
            if(c>=1)
                paint(image,color,r,c-1, newColor);
            if(r+1< image.length)
                paint(image, color, r+1, c, newColor);
            if(c+1<image[0].length)
                paint(image, color, r, c+1, newColor);

        }
    }


}
