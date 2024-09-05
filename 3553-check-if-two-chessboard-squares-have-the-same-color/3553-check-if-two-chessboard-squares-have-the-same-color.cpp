class Solution {
public:
    bool checkTwoChessboards(string c1, string c2) {
        vector<char> a;
        vector<char> b;
        for(auto& i : c1){
            a.push_back(i);
        }
        for(auto& j : c2){
            b.push_back(j);
        }
        int s1 = 0, s2 = 0;
        s1 += (a[0]-'a') + (a[1]-'1');
        s2 += (b[0]-'a') + (b[1]-'1');
        return s1%2==0 && s2%2 == 0 || s1%2 != 0 && s2%2 != 0? true: false;
    }
};