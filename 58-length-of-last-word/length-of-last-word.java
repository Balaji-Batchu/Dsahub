class Solution {
    public int lengthOfLastWord(String s) {
        // String[] a = s.trim().replaceAll("\\s+"," ").split(" ");
        // return a[a.length - 1].length();
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        int l = 0;
        while(i >=0 && s.charAt(i) != ' '){
            i--;
            l++;
        }
        return l;
    }
}