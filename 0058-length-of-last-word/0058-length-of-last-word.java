class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        boolean x = true;
        while(x){
            if(s.charAt(n) == ' ')
                n--;
            else
                x = false;
        }
            // n--;
        int ans = 0;
        for(int i = n; i >= 0; i--){
            if(s.charAt(i) == ' ')
                break;
            else
                ans++;
        }
        return ans;
    }
}