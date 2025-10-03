class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ans = new LinkedList<>();

        int decimal = 0;
        while(n > 0) {
            int temp = n % 10;
            int val = temp * (int) Math.pow(10, decimal);
            if(val != 0) ans.addFirst(val);
            decimal ++;
            n /= 10;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}