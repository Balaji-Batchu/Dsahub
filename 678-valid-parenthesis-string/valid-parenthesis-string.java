class Solution {
    public boolean checkValidString(String a) {
        int leftmin = 0;
        int leftmax = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '('){
                leftmin += 1;
                leftmax += 1;
            }
            else if(a.charAt(i) == ')'){
                leftmin -= 1;
                leftmax -= 1;
            }
            else{
                leftmin -= 1;
                leftmax += 1;
            }
            if(leftmax<0){
                return false;
            }
            leftmin=Math.max(0,leftmin);
        }
        return leftmin==0;
    }
}