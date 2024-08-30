class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        int j, i, ans = 0, n = nums.size();
        sort(nums.begin(), nums.end());
        vector<int> arr(n, 0);
        for(i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                if(nums[i] == nums[j]){
                    arr[i]++;
                    arr[j]++;
                }
            }
        }
        for(i = 0; i < n; i++){
            if(arr[i] == 0){
                ans += nums[i];
            }
        }
        return ans;
    }
};