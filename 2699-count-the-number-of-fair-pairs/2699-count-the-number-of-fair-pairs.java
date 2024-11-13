class Solution {
    public long countFairPairs(int[] nums, int l, int u) {
        Arrays.sort(nums);
        // int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int sum = nums[i] + nums[j];
        //         if((sum >= l) && (sum <= u))
        //             ans++;
        //     }
        // }


        return getVal(nums, u + 1) - getVal(nums, l);
    }

    private long getVal(int[] arr, int t){
        int l = 0;
        int r = arr.length-1;

        long res = 0;

        while(l < r){
            if(arr[l] + arr[r] < t){
                res += (r - l);
                l++;
            }
            else
                r--;
        }

        return res;
    }
}