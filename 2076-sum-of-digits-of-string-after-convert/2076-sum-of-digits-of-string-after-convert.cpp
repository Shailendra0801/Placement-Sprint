class Solution {
public:
    int getLucky(string s, int k) {
        string x = "";
        for(char i : s){
            x += to_string(i - 'a' +1);
        }
        while(k > 0){
            int ans = 0;
            for(char j : x){
                ans += j -'0';
            }
            x = to_string(ans);
            k--;
        }
        return stoi(x);
    }
};