class Solution {
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        Deque<int[]> dq = new ArrayDeque<>();

        // Add all border cells with 'O' to the queue
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dq.add(new int[]{i, 0});
            if (board[i][m - 1] == 'O') dq.add(new int[]{i, m - 1});
        }
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') dq.add(new int[]{0, j});
            if (board[n - 1][j] == 'O') dq.add(new int[]{n - 1, j});
        }

        // BFS to mark border-connected 'O's
        while (!dq.isEmpty()) {
            int[] current = dq.poll();
            int row = current[0], col = current[1];

            if (row < 0 || row >= n || col < 0 || col >= m || board[row][col] != 'O') {
                continue;
            }

            board[row][col] = 'T'; // Temporarily mark as visited

            // Add adjacent cells to the queue
            dq.add(new int[]{row - 1, col});
            dq.add(new int[]{row + 1, col});
            dq.add(new int[]{row, col - 1});
            dq.add(new int[]{row, col + 1});
        }

        // Replace all 'O' with 'X' (surrounded regions), and 'T' back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
