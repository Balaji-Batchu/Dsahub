class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.trim().replaceAll("\\s+"," ").split(" ");
        return a[a.length - 1].length();
    }
}