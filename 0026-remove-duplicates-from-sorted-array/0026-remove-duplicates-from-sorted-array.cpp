class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        set<int> ans;
        
        for(int j = 0; j < nums.size(); j++){
            ans.insert(nums[j]);
        }

        vector<int> anss(ans.begin(), ans.end());

        for(int i = 0; i < anss.size(); i++){
            nums[i] = anss[i];
        }
        return ans.size();
    }
};