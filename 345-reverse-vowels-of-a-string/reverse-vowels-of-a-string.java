class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        Stack<Character> vowels = new Stack<>();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !isVowel(ans.charAt(left))) left ++;
            while(left < right && !isVowel(ans.charAt(right))) right --;


            char temp = ans.charAt(right);
            ans.setCharAt(right, ans.charAt(left));
            ans.setCharAt(left, temp);

            left ++;
            right --;
        }

        return ans.toString();
    }

    private static boolean isVowel(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' 
            || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U') 
                return true;

        else return false;
    }
}