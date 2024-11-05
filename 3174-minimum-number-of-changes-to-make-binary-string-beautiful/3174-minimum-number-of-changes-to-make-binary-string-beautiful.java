class Solution {
    // Approach 1
    // public int minChanges(String s) {
    //     int ans = 0;
    //     for(int i = 0; i < s.length(); i += 2){
    //         boolean isTrue = check(s.substring(i, i+2));
    //         if(!isTrue)
    //             ans++;
    //     }
    //     return ans;
    // }

    // private boolean check(String s){
    //     return (s.equals("11") || s.equals("00"));
    // }

    // Approach 2
    public int minChanges(String s){
        int ans = 0,c = 0;
        for(int i = 0; i < s.length(); i++){
            c += s.charAt(i)-'0';
            if(i%2 == 1){
                ans += (c%2);
                c = 0;
            }
        }
        return ans;
    }
}