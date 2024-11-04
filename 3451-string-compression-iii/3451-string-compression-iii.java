class Solution {
    public String compressedString(String word) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            int pre = getNo(word.substring(i, word.length()));
            res.append(pre);
            res.append(word.charAt(i));
            i += pre-1;
        }

        return res.toString();
    }

    private int getNo(String s){
        int ans = 1;
        for(int i = 0; i < s.length()-1 && ans < 9; i++){
            if(s.charAt(i) == s.charAt(i+1))
                ans++;
            else
                break;
        }
        return ans;
    }
}