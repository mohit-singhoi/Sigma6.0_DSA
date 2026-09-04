// Word Search Problem : Leetcode 79

// Given an m x n grid of characters board and a string word, return true if word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

// Example 1
// Input : board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output : true


// Example  2
// Input : board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output : true

public class WordSerach {
        private int[] r = { -1, 1, 0, 0 }; // Row movement directions
        private int[] c = { 0, 0, -1, 1 }; // Column movement directions

        private boolean helper(int row, int col, char[][] board, int n, int m, int index, String word, int size) {
            if (index == size)
                return true;

            char ch = board[row][col];
            board[row][col] = '$'; // Mark as visited

            for (int i = 0; i < 4; i++) {
                int ur = row + r[i];
                int uc = col + c[i];

                if (ur >= 0 && ur < n && uc >= 0 && uc < m) {
                    if (board[ur][uc] == word.charAt(index)) {
                        if (helper(ur, uc, board, n, m, index + 1, word, size))
                            return true;
                    }
                }
            }

            board[row][col] = ch; // Restore the character
            return false;
        }

        public static  boolean exist(char[][] board, String word) {
            int n = board.length;
            int m = board[0].length;
            int size = word.length();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        if (helper(i, j, board, n, m, 1, word, size))
                            return true;
                    }
                }
            }
            return false;
        }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";
        System.out.println(exist(board, word)); // Output: true

        String word2 = "SEE";
        System.out.println(exist(board, word2)); // Output: true

        String word3 = "ABCB";
        System.out.println(exist(board, word3)); // Output: false
    }

}
