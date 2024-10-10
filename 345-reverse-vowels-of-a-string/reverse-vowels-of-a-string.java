class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(
            'a','e','i','o','u',
            'A','E','I','O','U'
        ));
        int left = 0, right = s.length() - 1;

        while(left < right){
            while(left < right && !vowels.contains(sb.charAt(left))) left ++;
            while(left < right && !vowels.contains(sb.charAt(right))) right --;

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left ++;
            right --;
        }

        return sb.toString();
    }
}