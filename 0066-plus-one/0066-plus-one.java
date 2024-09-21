class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i]+1+carry != 10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        for(int i = 1; i <= digits.length; i++){
            ans[i] = digits[i-1];
        }
        return ans;
    }
}