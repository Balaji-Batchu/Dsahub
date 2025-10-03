class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ans = new LinkedList<>();

        int decimal = 1;
        while(n > 0) {
            int temp = n % 10;
            int val = temp * decimal;
            if(val != 0) ans.addFirst(val);
            decimal *= 10;
            n /= 10;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}