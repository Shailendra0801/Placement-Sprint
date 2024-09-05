class Solution {
public:
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        int sum = 0;
        for(int i : rolls) 
            sum += i;

        int m = rolls.size();
        int l = n+m;

        int x = mean*l - sum;

        if(n*6 < x || x<n) 
            return {};

        int rem = x % n;
        int q   = x / n;

        vector<int> res(n,q);
        for(int i=1; i<=rem; i++)
            res[i]++;

        return res;

    }
};