class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc], n = image.length, m = image[0].length;
        floodHelper(sr, sc, image, initialColor, color, n, m);
        return image;
    }

    public static void floodHelper(int row, int col, int[][] image, 
                                int init, int color, int n, int m){
        if(row < 0 || row >= n || col < 0 || col >= m || image[row][col] != init 
                                || image[row][col] == color) return;

        image[row][col] = color;
        floodHelper(row, col - 1, image, init, color, n, m);
        floodHelper(row - 1, col, image, init, color, n, m);
        floodHelper(row, col + 1, image, init, color, n, m);
        floodHelper(row + 1, col, image, init, color, n, m);
    }
}