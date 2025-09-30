class Solution {
    public char findTheDifference(String s, String t) {
        char[] characters = new char[26];
        int index = 0;

        for(char x: s.toCharArray()) characters[x - 'a'] += 1;
        for(char y: t.toCharArray()) characters[y - 'a'] -= 1;

        for(int x = 0; x < 26; x ++) if(characters[x] >= 1) return (char) (x + ((int) 'a'));

        return 'a';
    }
}