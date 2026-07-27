class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder("");
        int n = num1.length() - 1, m = num2.length() - 1;
        int carry = 0;

        while(n >= 0 || m >= 0 || carry != 0) {
            String n1 = n >= 0 ? num1.charAt(n) + "" : "0";
            String n2 = m >= 0 ? num2.charAt(m) + "" : "0";
            int temp = Integer.parseInt(n1) + 
                            Integer.parseInt(n2) + carry;
            ans.append(temp % 10);
            carry = temp / 10;
            m --;
            n --;
        }

        return ans.reverse().toString();
        
    }
}