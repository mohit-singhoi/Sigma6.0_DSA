// Flood Fill Algorithm : Leetcode Problem 733
// Given a m x n integer grid image where image[i][j] represents the pixel value of the image.
// You are also given three integers sr , sc, and color. You should perform a flood fillon the image starting from the pixel image[sr][sc].
// To perform a flood fill, consider the starting pixel, plus any pixels connected 4-dirctinally to the starting pixel of the same  color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also withthe same color), and so on. Replace the color of all the aforementioned pixels with color.

// image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2

// Output: [[2,2,2],[2,2,0],[2,0,1]]

// Logic :
// left(sr, sc-1)
// right(sr, sc+1)
// up(sr-1, sc)
// down(sr+1, sc) 

public class FloodFillAlgo {

    public void helper(int[][] image, int sr, int sc,
                       int color, boolean[][] vis, int orgCol) {

        // Base Case
        if (sr < 0 || sc < 0 ||
            sr >= image.length || sc >= image[0].length ||
            vis[sr][sc] ||
            image[sr][sc] != orgCol) {
            return;
        }

        // Mark visited
        vis[sr][sc] = true;

        // Change color
        image[sr][sc] = color;

        // Left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // Right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // Up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // Down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color) {
            return image;
        }

        boolean[][] vis = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, image[sr][sc]);

        return image;
    }

    public static void main(String[] args) {

        FloodFillAlgo obj = new FloodFillAlgo();

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[][] ans = obj.floodFill(image, 1, 1, 2);

        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
