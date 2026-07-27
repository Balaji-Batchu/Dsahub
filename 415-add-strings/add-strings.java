class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder("");
        int n = num1.length() - 1, m = num2.length() - 1;
        int carry = 0;

        while(n >= 0 && m >= 0) {
            int temp = Integer.parseInt(num1.charAt(n) + "") + 
                            Integer.parseInt(num2.charAt(m) + "") + carry;
            carry = 0;
            System.out.println("temp: " + temp);
            ans.append(temp % 10);
            if(temp > 9) {
                carry = temp / 10;
            } 
            m --;
            n --;
        }
        while(n >= 0) {
            int sum = carry + Integer.parseInt(num1.charAt(n) + "");
            if(sum > 9) {
                ans.append(sum % 10);
                carry = sum / 10;
            } else {
                ans.append(sum);
                carry = 0;
            }
            n --;
        }
        while(m >= 0) {
            int sum = carry + Integer.parseInt(num2.charAt(m) + "");
            if(sum > 9) {
                ans.append(sum % 10);
                carry = sum / 10;
            } else {
                ans.append(sum);
                carry = 0;
            }
            m --;
        }
        if(carry != 0) ans.append(carry);

        return ans.reverse().toString();
        
    }
}