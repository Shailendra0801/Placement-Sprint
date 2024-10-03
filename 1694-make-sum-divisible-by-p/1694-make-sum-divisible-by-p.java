class Solution {
    public int minSubarray(int[] nums, int p) {
        long p_sum = 0, sum = 0;
        int n = nums.length;
        for(int i : nums){
            sum += i;
        }
        int modd = (int)(sum%p);
        if(sum%p == 0)
            return 0;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            p_sum += nums[i];
            int mod = (int)(p_sum%p);
            if(mod < 0)
                mod += p;
            int req_mod = (mod - modd + p)%p;

            if(mp.containsKey(req_mod)){
                int idx = mp.get(req_mod);
                n = Math.min(n, i - idx);
            }

            mp.put(mod, i);

        }

        return n == nums.length? -1: n;
    }
}