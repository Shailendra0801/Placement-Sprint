class Solution {
    public String compressedString(String word) {

            // Approach 1

    //     StringBuilder res = new StringBuilder();
    //     for(int i = 0; i < word.length(); i++){
    //         int pre = getNo(word.substring(i, word.length()));
    //         res.append(pre);
    //         res.append(word.charAt(i));
    //         i += pre-1;
    //     }

    //     return res.toString();
    // }

    // private int getNo(String s){
    //     int ans = 1;
    //     for(int i = 0; i < s.length()-1 && ans < 9; i++){
    //         if(s.charAt(i) == s.charAt(i+1))
    //             ans++;
    //         else
    //             break;
    //     }
    //     return ans;

    //  Approach 2

    StringBuilder res = new StringBuilder();
        int cnt = 0,j = 0;
        for(int i = 0;i < word.length(); ++i){
            j = i;
            char ch = word.charAt(i);
            while(j < word.length() && word.charAt(j) == ch){
                ++cnt;
                ++j;
            }
            while(cnt > 9){
                res.append('9');
                res.append(ch);
                cnt -= 9;

            }
            res.append((char)(cnt+'0'));
            res.append(ch);
            cnt = 0;
            i = j-1;

        }
        return res.toString();
    }
}