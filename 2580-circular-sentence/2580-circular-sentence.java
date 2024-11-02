class Solution {
    public boolean isCircularSentence(String s) {
        // if(s.charAt(0) != s.charAt(s.length()-1))
        //     return false;
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == ' '){
        //         if(s.charAt(i-1) != s.charAt(i+1))
        //             return false;
        //     }
        // }

        // return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        int k = s.indexOf(" ");
        if (k == -1)
            return true;

        while (k != -1) {
            if (s.charAt(k - 1) != s.charAt(k + 1)) {
                return false;
            }

            k = s.indexOf(" ", k+1);
        }
        return true;
    }
}