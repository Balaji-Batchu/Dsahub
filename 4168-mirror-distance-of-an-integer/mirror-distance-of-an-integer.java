class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()) - n);
    }
}