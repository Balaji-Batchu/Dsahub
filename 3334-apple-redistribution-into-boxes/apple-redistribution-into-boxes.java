class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int n = capacity.length;
        int buckets = 0;

        for(int i = n - 1; sum > 0 && i >= 0; i --) {
            sum -= capacity[i];
            buckets ++;
        }

        return buckets;
    }
}