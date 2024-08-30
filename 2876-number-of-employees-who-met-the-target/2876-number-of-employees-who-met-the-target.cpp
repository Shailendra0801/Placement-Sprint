class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& arr, int t) {
        int ans = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr[i] >= t)
                ans++;
        }
        return ans;
    }
};