class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);

        return image;
    }

    public void dfs(int[][] image, int i, int j, int ncolor, int ocolor){
        if(i <0 || j<0 || i>=image.length || j>=image[0].length || 
            image[i][j] == ncolor || image[i][j] != ocolor){
                return;
            }

        image[i][j] = ncolor;

        dfs(image, i-1, j, ncolor, ocolor);
        dfs(image, i+1, j, ncolor, ocolor);
        dfs(image, i, j-1, ncolor, ocolor);
        dfs(image, i, j+1, ncolor, ocolor);
    }
}