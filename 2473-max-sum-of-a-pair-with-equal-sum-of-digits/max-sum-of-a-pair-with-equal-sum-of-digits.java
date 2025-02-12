class Solution {

    // Function to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Main function to find the maximum sum
    public int maximumSum(int[] nums) {
        Map<Integer, int[]> sumToMaxNums = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sumDigits = sumOfDigits(num);

            if (sumToMaxNums.containsKey(sumDigits)) {
                int[] pair = sumToMaxNums.get(sumDigits);

                if (num > pair[0]) {
                    pair[1] = pair[0];
                    pair[0] = num;
                }

                else if (num > pair[1]) {
                    pair[1] = num;
                }

                if (pair[0] != 0 && pair[1] != 0) {
                    maxSum = Math.max(maxSum, pair[0] + pair[1]);
                }
            } else {
                sumToMaxNums.put(sumDigits, new int[]{num, 0});
            }
        }

        return maxSum;
    }
}
