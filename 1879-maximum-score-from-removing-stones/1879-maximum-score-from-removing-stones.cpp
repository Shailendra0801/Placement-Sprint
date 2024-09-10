class Solution {
public:
    int maximumScore(int a, int b, int c) {
        return ((max(max(a,b),c)) > (a + b + c) - (max(max(a,b),c))) ? (a + b + c) - (max(max(a,b),c)) : (a + b + c) / 2;
    }
};