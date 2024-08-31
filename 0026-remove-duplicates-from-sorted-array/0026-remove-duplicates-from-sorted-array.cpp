class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int a = 1;
        if(nums.size() == 0)
            return 0;
        
        for(int j = 1; j < nums.size(); j++){
            if(nums[j] != nums[j-1]){
                nums[a] = nums[j];
                a++;
            }
        }
        return a;
    }
};