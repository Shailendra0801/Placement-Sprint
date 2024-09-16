class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57){
                ans.append(c);
            }
        }
        String a = ans.toString();
        String anss = a.toLowerCase();
        int n = anss.length();
        
        int j = n-1;
        for(int i = 0; i < n/2; i++){
            if(anss.charAt(i) != anss.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}