class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = -1;
        int row = 0, col = 0;
        
        for(String command: commands){
            switch (command){
                case "RIGHT": {
                    col ++;
                    break;
                }
                case "LEFT": {
                    col --;
                    break;
                }
                case "UP": {
                    row --;
                    break;
                }
                case "DOWN": {
                    row ++;
                    break;
                }
            }
        }
        ans = (row * n) + col;
        return ans;
    }
}