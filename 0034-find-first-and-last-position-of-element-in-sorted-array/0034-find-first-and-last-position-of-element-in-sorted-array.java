class Solution {
    private int bSearch(int[] arr, int t, boolean isSearchingLeft){
        int l = 0;
        int r = arr.length-1;
        int idx = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > t)
                r = mid-1;
            else if(arr[mid] < t)
                l = mid+1;
            else{
                idx = mid;
                if(isSearchingLeft)
                    r = mid-1;
                else
                    l = mid+1;
            }
        }
        return idx;
    }

    public int[] searchRange(int[] nums, int t) {
        int[] ans = {-1, -1};
        if(nums.length == 0)
            return ans;
        int a = bSearch(nums, t, true);
        int b = bSearch(nums, t, false);

        ans[0] = a;
        ans[1] = b;

        return ans;
        
    }
}