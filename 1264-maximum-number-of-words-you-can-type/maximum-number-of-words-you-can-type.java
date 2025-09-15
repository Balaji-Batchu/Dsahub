class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] letters = new int[26];
        int whole_words = 0;
        
        for(char c: brokenLetters.toCharArray()){
            letters[c - 97] = 1;
        }
        System.out.println(Arrays.toString(letters));
        
        int broken = 0;
        for(char c: text.toCharArray()){
            if(c != ' '){
                if(letters[c - 97] == 1) {
                    System.out.println("Broken at: " + c);
                    broken = 1;
                }
            } 
            
            else {
                if(broken == 0){
                    System.out.println("incrementing : " + broken);
                    whole_words ++;
                }
                broken = 0;
            }
        }
        
        System.out.println("Broken: " + broken);
        if(broken == 0) whole_words ++;
        
        return whole_words;
    }
}