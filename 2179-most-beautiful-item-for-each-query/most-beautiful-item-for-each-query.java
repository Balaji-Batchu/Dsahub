class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        
        // Step 2: Create a TreeMap to store the maximum beauty up to each price
        TreeMap<Integer, Integer> maxBeautyMap = new TreeMap<>();
        int maxBeauty = 0;

        for (int[] item : items) {
            int price = item[0];
            int beauty = item[1];
            maxBeauty = Math.max(maxBeauty, beauty);
            maxBeautyMap.put(price, maxBeauty);
        }

        // Step 3: Answer each query
        int qLength = queries.length;
        int[] result = new int[qLength];
        
        for (int i = 0; i < qLength; i++) {
            int query = queries[i];
            // Find the highest price <= query using floorKey
            Integer floorKey = maxBeautyMap.floorKey(query);
            if (floorKey == null) {
                result[i] = 0;  // No items are affordable for this query
            } else {
                result[i] = maxBeautyMap.get(floorKey);  // Maximum beauty for prices <= query
            }
        }
        
        return result;
    }

}