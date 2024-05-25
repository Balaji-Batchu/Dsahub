class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        
        // HashMap to keep track of the color of each ball
        HashMap<Integer, Integer> ballColorMap = new HashMap<>();
        
        // HashSet to keep track of unique colors
        HashSet<Integer> uniqueColors = new HashSet<>();
        
        // HashMap to keep track of color frequencies
        HashMap<Integer, Integer> colorFrequency = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            
            // Check if the ball was already colored
            if (ballColorMap.containsKey(ball)) {
                int oldColor = ballColorMap.get(ball);
                // Decrease the frequency of the old color
                colorFrequency.put(oldColor, colorFrequency.get(oldColor) - 1);
                // If the old color frequency drops to 0, remove it from the set of unique colors
                if (colorFrequency.get(oldColor) == 0) {
                    uniqueColors.remove(oldColor);
                }
            }
            
            // Update the color of the ball
            ballColorMap.put(ball, color);
            // Increase the frequency of the new color
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);
            // Add the new color to the set of unique colors
            uniqueColors.add(color);
            
            // Record the number of unique colors
            result[i] = uniqueColors.size();
        }
        
        return result;
    }
}