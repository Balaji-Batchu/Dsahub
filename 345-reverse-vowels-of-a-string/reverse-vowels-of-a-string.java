class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> vowels = new Stack<>();

        for(char x: s.toCharArray()){
            if(isVowel(x)) vowels.push(x);
        }

        for(char x: s.toCharArray()){
            if(isVowel(x)) ans.append(vowels.pop());
            else ans.append(x);
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