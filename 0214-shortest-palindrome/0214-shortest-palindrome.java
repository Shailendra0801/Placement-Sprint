class Solution {

    private int[] combinedLPS(String s){
        int n = s.length();
        int[] ret = new int[n];
        ret[0] = 0;
        int len = 0;
        for(int i = 1; i < n; i++){
            while(len > 0 && s.charAt(i) != s.charAt(len)){
                len = ret[len-1];
            }
            if(s.charAt(i) == s.charAt(len))
                len++;

            ret[i] = len;
        }

        return ret;
    }

    public String shortestPalindrome(String s) {
        if(s == null ||s.length() == 0){
            return s;
        }
        String rev = new StringBuilder(s).reverse().toString();
        String comb = s + "#" + rev;
        int[] lps = combinedLPS(comb);
        int len = s.length() - lps[comb.length()-1];
        String addd = rev.substring(0,len);

        return addd + s;

    }
}