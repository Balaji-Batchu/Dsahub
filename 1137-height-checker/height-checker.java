class Solution {
    public int heightChecker(int[] heights) {
        int[] bucket = new int[101];
        int[] expected = new int[heights.length + 1];
        int index = 0;
        for(int x: heights) bucket[x] += 1;
        for(int x = 0; x < bucket.length; x ++){
            while(bucket[x] > 0){
                expected[index] = x;
                bucket[x] --;
                index ++;
            }
        }
        
        int count = 0;
        for(int x = 0; x < expected.length - 1; x ++){
            if(heights[x] != expected[x]) count ++;
        }
        return count;
    }
}